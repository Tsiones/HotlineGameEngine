package net.ddns.endertsion.gameengine.entities;

import java.io.Serializable;
import java.util.Arrays;
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

	public void addAll(GameEntity... entitiesArray)
	{
		Arrays.stream(entitiesArray).forEach(this::add);
	}

	public void addAll(Collection<GameEntity> entitiesCollection)
	{
		entitiesCollection.stream().forEach(this::add);
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
