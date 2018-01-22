package net.ddns.endertsion.gameengine.keyboard.binds;

import net.ddns.endertsion.gameengine.keyboard.BindType;
import net.ddns.endertsion.gameengine.keyboard.KeyboardEvent;

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
