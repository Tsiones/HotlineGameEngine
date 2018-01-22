package net.ddns.endercrypt.keyboard;

@FunctionalInterface
public interface KeyboardListener
{
	void trigger(KeyboardEvent keyboardEvent);
}
