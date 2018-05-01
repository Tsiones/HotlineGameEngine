package net.ddns.endertsion.gameengine.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import net.ddns.endertsion.gameengine.room.Room;

public class GameEntities implements Serializable
{
	private static final long serialVersionUID = -4603230297232749703L;

	/**
	 * 
	 */

	private Map<Class<? extends GameEntity>, Set<? extends GameEntity>> entities = new HashMap<>();

	private Room roomContext;

	public GameEntities(Room roomContext)
	{
		this.roomContext = roomContext;
	}

	// ADD //

	public void add(GameEntity entity)
	{
		if (entity.roomContext != null)
		{
			throw new IllegalArgumentException("Cannot add entity " + entity + " as its currently in another room");
		}
		entity.roomContext = roomContext;
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

	public <T extends GameEntity> Optional<T> getEntity(Class<T> entityClass)
	{
		return getCollection(entityClass).stream().findAny();
	}

	public <T extends GameEntity> Set<T> getEntitiesOf(Class<T> entityClass)
	{
		return Collections.unmodifiableSet(getCollection(entityClass));
	}

	@SuppressWarnings("unchecked")
	public <T extends GameEntity> Set<? extends T> getEntitiesOfSubtype(Class<T> entityClass)
	{
		Set<Class<? extends GameEntity>> classes = entities.keySet();
		classes.removeIf(c -> !entityClass.isAssignableFrom(c));
		Set<? extends T> result = (Set<? extends T>) classes.stream().flatMap(c -> getCollection(c).stream()).collect(Collectors.toSet());
		return Collections.unmodifiableSet(result);
	}

	// REMOVE //

	public boolean remove(GameEntity entity)
	{
		if (entity.roomContext == null)
		{
			throw new IllegalArgumentException("Cannot remove entity " + entity + " as its currently not in a room");
		}
		entity.roomContext = null;
		return getCollection(entity).remove(entity);
	}

	public void clear(Class<? extends GameEntity> entityClass)
	{
		getCollection(entityClass).forEach(this::remove);
	}

	public void clearAll()
	{
		for (Class<? extends GameEntity> entityClass : entities.keySet())
		{
			clear(entityClass);
		}
	}

	// MISC //

	public boolean contains(GameEntity entity)
	{
		return getCollection(entity).contains(entity);
	}

	// COLLECTION //

	@SuppressWarnings("unchecked")
	private <T extends GameEntity> Set<T> getCollection(T entity)
	{
		return (Set<T>) getCollection(entity.getClass());
	}

	@SuppressWarnings("unchecked")
	private <T extends GameEntity> Set<T> getCollection(Class<T> entityClass)
	{
		Set<T> list = (Set<T>) entities.get(entityClass);
		if (list == null)
		{
			list = new HashSet<>();
			entities.put(entityClass, list);
		}
		return list;
	}
}
