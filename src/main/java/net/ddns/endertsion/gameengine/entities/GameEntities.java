package net.ddns.endertsion.gameengine.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameEntities implements Serializable
{
	private static final long serialVersionUID = -4603230297232749703L;

	/**
	 * 
	 */

	private Map<Class<?>, List<GameEntity>> entities = new HashMap<>();

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

	private List<GameEntity> getList(GameEntity entity)
	{
		Class<? extends GameEntity> realClass = entity.getClass();
		List<GameEntity> list = entities.get(realClass);
		if (list == null)
		{
			list = new ArrayList<>();
			entities.put(realClass, list);
		}
		return list;
	}
}
