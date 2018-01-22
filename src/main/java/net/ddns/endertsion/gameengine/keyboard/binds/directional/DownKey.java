package net.ddns.endertsion.gameengine.keyboard.binds.directional;

import java.awt.event.KeyEvent;

import net.ddns.endertsion.gameengine.keyboard.BindType;

public class DownKey extends AbstractDirectionalKey
{
	public DownKey(BindType bindType)
	{
		super(bindType, KeyEvent.VK_DOWN, KeyEvent.VK_S);
	}
}
