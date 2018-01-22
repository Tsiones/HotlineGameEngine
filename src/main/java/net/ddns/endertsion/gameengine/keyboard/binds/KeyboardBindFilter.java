package net.ddns.endercrypt.keyboard.binds;

import net.ddns.endercrypt.keyboard.KeyboardEvent;

public interface KeyboardBindFilter
{
	public boolean check(KeyboardEvent keyboardEvent);
}
