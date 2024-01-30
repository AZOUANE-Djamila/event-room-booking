package dz.ibnrochd.master15.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dz.ibnrochd.master15.Models.Reservation;
import dz.ibnrochd.master15.Models.LigneReservation;

@Repository
public interface LigneReservationRepository extends JpaRepository<LigneReservation, Integer> 
{
	List<LigneReservation> findByReservation(Reservation reserv);


}
