package net.ddns.endertsion.gameengine.keyboard.binds;

import net.ddns.endertsion.gameengine.keyboard.BindType;
import net.ddns.endertsion.gameengine.keyboard.KeyboardEvent;

public class SpecificKey implements KeyboardBindFilter
{
	private BindType bindType;
	private int keyCode;

	public SpecificKey(BindType bindType, int keyCode)
	{
		this.bindType = bindType;
		this.keyCode = keyCode;
	}

	@Override
	public boolean check(KeyboardEvent keyboardEvent)
	{
		if (keyboardEvent.getBindType() != bindType)
		{
			return false;
		}
		if (keyboardEvent.getKeyCode() != keyCode)
		{
			return false;
		}
		return true;
	}
}
