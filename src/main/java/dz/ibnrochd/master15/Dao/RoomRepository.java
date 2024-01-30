package dz.ibnrochd.master15.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dz.ibnrochd.master15.Models.LigneReservation;
import dz.ibnrochd.master15.Models.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> 
{
    List<Room> findAll();
	Room findRoomByLigneReservations(LigneReservation lc);

}
