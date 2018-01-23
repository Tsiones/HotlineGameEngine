package net.ddns.endertsion.gameengine.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GameEntities implements Serializable
{
	private static final long serialVersionUID = -4603230297232749703L;

	/**
	 * 
	 */

	private Map<Class<?>, Set<GameEntity>> entities = new HashMap<>();

	public void add(GameEntity entity)
	{
		getList(entity).add(entity);
	}

	public boolean remove(GameEntity entity)
	{
		return getList(entity).remove(entity);
	}

	public boolean contains(GameEntity entity)
	{
		return getList(entity).contains(entity);
	}

	private Collection<GameEntity> getList(GameEntity entity)
	{
		Class<? extends GameEntity> realClass = entity.getClass();
		Set<GameEntity> list = entities.get(realClass);
		if (list == null)
		{
			list = new HashSet<>();
			entities.put(realClass, list);
		}
		return list;
	}
}
