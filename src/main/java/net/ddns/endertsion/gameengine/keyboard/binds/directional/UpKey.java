package net.ddns.endercrypt.keyboard.binds.directional;

import java.awt.event.KeyEvent;

import net.ddns.endercrypt.keyboard.BindType;

public class UpKey extends AbstractDirectionalKey
{
	public UpKey(BindType bindType)
	{
		super(bindType, KeyEvent.VK_UP, KeyEvent.VK_W);
	}
}
