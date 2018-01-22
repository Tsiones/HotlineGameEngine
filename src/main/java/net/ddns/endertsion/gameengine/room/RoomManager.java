package net.ddns.endertsion.gameengine.room;

import java.util.Optional;

public class RoomManager
{
	private Optional<Room> optionalRoom = Optional.empty();

	public RoomManager()
	{

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
}
