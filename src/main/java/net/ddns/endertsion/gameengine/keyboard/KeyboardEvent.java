package net.ddns.endertsion.gameengine.keyboard;

import java.awt.event.KeyEvent;

public class KeyboardEvent
{
	private int keyCode;
	private BindType bindType;
	private boolean shift, ctrl, meta;

	public KeyboardEvent(int keyCode, BindType bindType, KeyboardManager keyboardManager)
	{
		this.keyCode = keyCode;
		this.bindType = bindType;

		shift = keyboardManager.keyIsHeld(KeyEvent.VK_SHIFT);
		ctrl = keyboardManager.keyIsHeld(KeyEvent.VK_CONTROL);
		meta = keyboardManager.keyIsHeld(KeyEvent.VK_META);
	}

	public int getKeyCode()
	{
		return keyCode;
	}

	public BindType getBindType()
	{
		return bindType;
	}

	public boolean isShiftHeld()
	{
		return shift;
	}

	public boolean isCtrlHeld()
	{
		return ctrl;
	}

	public boolean isMetaHeld()
	{
		return meta;
	}
}
