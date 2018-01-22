package net.ddns.endertsion.gameengine.keyboard.binds.directional;

import net.ddns.endertsion.gameengine.keyboard.BindType;
import net.ddns.endertsion.gameengine.keyboard.binds.MultiKey;
import net.ddns.endertsion.gameengine.keyboard.binds.SpecificKey;

public class AbstractDirectionalKey extends MultiKey
{
	protected AbstractDirectionalKey(BindType bindType, int... keys)
	{
		super(bindType, generateKeys(bindType, keys));
	}

	private static SpecificKey[] generateKeys(BindType bindType, int[] keys)
	{
		SpecificKey[] specificKeys = new SpecificKey[keys.length];
		for (int i = 0; i < keys.length; i++)
		{
			specificKeys[i] = new SpecificKey(bindType, keys[i]);
		}
		return specificKeys;
	}
}
