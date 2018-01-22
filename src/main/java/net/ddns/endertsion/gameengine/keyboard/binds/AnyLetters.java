package net.ddns.endertsion.gameengine.keyboard.binds;

import java.awt.event.KeyEvent;

import net.ddns.endertsion.gameengine.keyboard.BindType;
import net.ddns.endertsion.gameengine.keyboard.KeyboardEvent;

public class AnyLetters extends BindRange
{
	private boolean allowSpace;

	public AnyLetters(BindType bindType, boolean allowSpace)
	{
		super(bindType, KeyEvent.VK_A, KeyEvent.VK_Z);
		this.allowSpace = allowSpace;
	}

	@Override
	public boolean check(KeyboardEvent keyboardEvent)
	{
		if (keyboardEvent.getBindType() == bindType)
		{
			// check for letters
			if (super.check(keyboardEvent))
			{
				return true;
			}
			// check for space
			if (allowSpace)
			{
				int keyCode = keyboardEvent.getKeyCode();
				if (keyCode == KeyEvent.VK_SPACE)
				{
					return true;
				}
			}
		}
		return false;
	}
}