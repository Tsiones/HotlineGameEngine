package net.ddns.endercrypt.keyboard.binds.directional;

import java.awt.event.KeyEvent;

import net.ddns.endercrypt.keyboard.BindType;

public class LeftKey extends AbstractDirectionalKey
{
	public LeftKey(BindType bindType)
	{
		super(bindType, KeyEvent.VK_LEFT, KeyEvent.VK_A);
	}
}
