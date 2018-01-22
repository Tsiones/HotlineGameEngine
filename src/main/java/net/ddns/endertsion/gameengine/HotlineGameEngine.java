package net.ddns.endertsion.gameengine;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import net.ddns.endertsion.gameengine.keyboard.KeyboardManager;

public class HotlineGameEngine
{
	private final JPanel panel;
	private final JFrame frame;

	private final KeyboardManager keyboard = new KeyboardManager();

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

		keyboard.install(frame);
	}

	private void draw(Graphics2D g2d)
	{
		g2d.fillOval(2, 2, 55, 55);
	}
}
