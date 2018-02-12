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

	// ADD //

	public void add(GameEntity entity)
	{
		getCollection(entity).add(entity);
	}

	public void addAll(GameEntity... entitiesArray)
	{
		Arrays.stream(entitiesArray).forEach(this::add);
	}

	public void addAll(Collection<GameEntity> entitiesCollection)
	{
		entitiesCollection.stream().forEach(this::add);
	}

	// GET //

	// MISC //

	public boolean remove(GameEntity entity)
	{
		return getCollection(entity).remove(entity);
	}

	public boolean contains(GameEntity entity)
	{
		return getCollection(entity).contains(entity);
	}

	// COLLECTION //

	private Set<GameEntity> getCollection(GameEntity entity)
	{
		Class<? extends GameEntity> entityClass = entity.getClass();
		return getCollection(entityClass);
	}

	private Set<GameEntity> getCollection(Class<? extends GameEntity> entityClass)
	{
		Set<GameEntity> list = entities.get(entityClass);
		if (list == null)
		{
			list = new HashSet<>();
			entities.put(entityClass, list);
		}
		return list;
	}
}
