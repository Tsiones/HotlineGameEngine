package net.ddns.endercrypt.keyboard.binds.directional;

import java.awt.event.KeyEvent;

import net.ddns.endercrypt.keyboard.BindType;

public class DownKey extends AbstractDirectionalKey
{
	public DownKey(BindType bindType)
	{
		super(bindType, KeyEvent.VK_DOWN, KeyEvent.VK_S);
	}
}
