package net.ddns.endertsion.gameengine.keyboard.binds;

import java.awt.event.KeyEvent;

import net.ddns.endertsion.gameengine.keyboard.BindType;

public class AnyNumbers extends BindRange
{
	public AnyNumbers(BindType bindType)
	{
		super(bindType, KeyEvent.VK_0, KeyEvent.VK_9);
	}
}