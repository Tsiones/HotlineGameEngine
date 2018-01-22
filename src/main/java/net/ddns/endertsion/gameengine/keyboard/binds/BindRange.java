package net.ddns.endercrypt.keyboard.binds;

import net.ddns.endercrypt.keyboard.BindType;
import net.ddns.endercrypt.keyboard.KeyboardEvent;

public class BindRange implements KeyboardBindFilter
{
	protected final BindType bindType;
	protected final int minRange, maxRange;

	public BindRange(BindType bindType, int minRange, int maxRange)
	{
		this.bindType = bindType;
		this.minRange = minRange;
		this.maxRange = maxRange;
	}

	@Override
	public boolean check(KeyboardEvent keyboardEvent)
	{
		if (keyboardEvent.getBindType() == bindType)
		{
			int keyCode = keyboardEvent.getKeyCode();
			if ((keyCode >= minRange) && (keyCode <= maxRange))
			{
				return true;
			}
		}
		return false;
	}
}
