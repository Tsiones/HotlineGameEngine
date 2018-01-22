package net.ddns.endertsion.gameengine.keyboard;

@FunctionalInterface
public interface KeyboardListener
{
	void trigger(KeyboardEvent keyboardEvent);
}
