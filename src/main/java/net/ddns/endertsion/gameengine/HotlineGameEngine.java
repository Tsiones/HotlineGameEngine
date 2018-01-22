package net.ddns.endertsion.gameengine;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HotlineGameEngine
{
	private JPanel panel;
	private JFrame frame;

	@SuppressWarnings("serial")
	public HotlineGameEngine(String title)
	{
		panel = new JPanel()
		{
			@Override
			protected void paintComponent(Graphics g)
			{
				draw((Graphics2D) g);
			}
		};

		frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setMinimumSize(new Dimension(1000, 500));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void draw(Graphics2D g2d)
	{
		g2d.fillOval(2, 2, 55, 55);
	}
}
