package net.ddns.endertsion.gameengine.room;

import java.awt.Graphics2D;
import java.io.Serializable;

import net.ddns.endertsion.gameengine.entities.GameEntities;
import net.ddns.endertsion.gameengine.entities.GameEntity;

public class Room implements Serializable
{
	private static final long serialVersionUID = -1442867546520862802L;

	/**
	 * 
	 */

	private GameEntities entities = new GameEntities();

	public Room addEntity(GameEntity entity)
	{
		entities.add(entity);
		return this;
	}

	public void update()
	{
		// TODO: implement
	}

	public void draw(Graphics2D g2d)
	{
		// TODO: implement
	}
}
