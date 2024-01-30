package dz.ibnrochd.master15.Business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master15.Dao.LigneReservationRepository;
import dz.ibnrochd.master15.Dao.RoomRepository;
import dz.ibnrochd.master15.Models.Reservation;
import dz.ibnrochd.master15.Models.Room;

@Service
public class RoomService implements IRoomService{

	@Autowired
	RoomRepository roomRepository;
	
	@Autowired
	LigneReservationRepository lCRepository;
	
	@Autowired
	LigneReservationRepository cRepository;

	
	public void creerRoom(Room room) {
		roomRepository.save(room);		
	}


	public void modifierRoom(Room room) {
		roomRepository.save(room);
	}


	public void supprimerRooms(Room room) {
		roomRepository.delete(room);		
	}

	public List<Room> findAllRooms() {
		
		return roomRepository.findAll();
	}
	
	/**
	 * Lister les rooms par reservation
	 * J'ai récupéré les room grace aux lignes de reservation pour chaque reservation
	 */
	public List<Room> listeRoomsParReservation(Reservation c) {
		List<Room> lt = new ArrayList<>();
		lCRepository.findByReservation(c).forEach(lc->{
			lt.add(roomRepository.findRoomByLigneReservations(lc));
		});
		return lt;
	}
	
	
}