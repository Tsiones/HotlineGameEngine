package net.ddns.endercrypt.keyboard.binds;

import java.awt.event.KeyEvent;

import net.ddns.endercrypt.keyboard.BindType;

public class AnyNumbers extends BindRange
{
	public AnyNumbers(BindType bindType)
	{
		super(bindType, KeyEvent.VK_0, KeyEvent.VK_9);
	}
}