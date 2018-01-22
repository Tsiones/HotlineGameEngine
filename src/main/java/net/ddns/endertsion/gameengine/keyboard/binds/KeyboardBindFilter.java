package net.ddns.endertsion.gameengine.keyboard.binds;

import net.ddns.endertsion.gameengine.keyboard.KeyboardEvent;

public interface KeyboardBindFilter
{
	public boolean check(KeyboardEvent keyboardEvent);
}
