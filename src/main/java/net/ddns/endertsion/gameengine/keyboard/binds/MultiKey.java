package net.ddns.endercrypt.keyboard.binds;

import net.ddns.endercrypt.keyboard.BindType;
import net.ddns.endercrypt.keyboard.KeyboardEvent;

public class MultiKey implements KeyboardBindFilter
{
	private BindType bindType;
	private SpecificKey[] keys;

	public MultiKey(BindType bindType, SpecificKey... keys)
	{
		this.bindType = bindType;
		this.keys = keys;
	}

	@Override
	public boolean check(KeyboardEvent keyboardEvent)
	{
		if (keyboardEvent.getBindType() == bindType)
		{
			for (SpecificKey specificKey : keys)
			{
				if (specificKey.check(keyboardEvent))
				{
					return true;
				}
			}
		}
		return false;
	}
}
