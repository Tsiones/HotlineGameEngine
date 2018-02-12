package net.ddns.endertsion.gameengine.room;

import java.awt.Graphics2D;
import java.io.File;
import java.util.Optional;

import net.ddns.endertsion.gameengine.entities.GameEntity;

public class RoomManager
{
	private Optional<Room> optionalRoom = Optional.empty();

	public RoomManager()
	{

	}

	public Room startRoom(GameEntity initEntity)
	{
		Room room = new Room();
		room.entities().add(initEntity);
		setRoom(room);
		return room;
	}

	public void setRoom(Room room)
	{
		optionalRoom = Optional.of(room);
	}

	public Room getRoom()
	{
		return optionalRoom.get();
	}

	public boolean hasRoom()
	{
		return optionalRoom.isPresent();
	}

	public void draw(Graphics2D g2d)
	{
		if (hasRoom())
		{
			Room room = getRoom();
			room.draw(g2d);
		}
	}

	public void save(File file)
	{
		// TODO: implement
	}

	public void load(File file)
	{
		// TODO: implement
	}
}
