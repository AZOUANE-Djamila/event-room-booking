package dz.ibnrochd.master15.Business;

import java.util.List;

import dz.ibnrochd.master15.Models.Reservation;
import dz.ibnrochd.master15.Models.Room;

public interface IRoomService {

	List<Room> findAllRooms();
	void creerRoom(Room room);
	void modifierRoom(Room room);
	void supprimerRooms(Room room);
	List<Room> listeRoomsParReservation(Reservation c);
}
