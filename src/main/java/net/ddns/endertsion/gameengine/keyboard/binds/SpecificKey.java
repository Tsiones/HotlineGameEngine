package net.ddns.endercrypt.keyboard.binds;

import net.ddns.endercrypt.keyboard.BindType;
import net.ddns.endercrypt.keyboard.KeyboardEvent;

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
