package net.ddns.endertsion.gameengine;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HotlineGameEngine
{
	private JPanel panel;
	private JFrame frame;

	public HotlineGameEngine(String title)
	{
		panel = new JPanel();

		frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setMinimumSize(new Dimension(1000, 500));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
