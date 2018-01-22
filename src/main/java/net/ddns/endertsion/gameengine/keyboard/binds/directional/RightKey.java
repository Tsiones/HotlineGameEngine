package net.ddns.endercrypt.keyboard.binds.directional;

import java.awt.event.KeyEvent;

import net.ddns.endercrypt.keyboard.BindType;

public class RightKey extends AbstractDirectionalKey
{
	public RightKey(BindType bindType)
	{
		super(bindType, KeyEvent.VK_RIGHT, KeyEvent.VK_D);
	}
}
