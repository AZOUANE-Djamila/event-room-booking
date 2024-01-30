package dz.ibnrochd.master15.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import dz.ibnrochd.master15.Models.Reservation;
import dz.ibnrochd.master15.Models.Person;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

	Reservation findById(int id);
	
	@Query("select c from Reservation c where c.motif = ?1")
	List<Reservation> rechercheParMotif(String  motif);
	List<Reservation> findByPerson(Person person);
	Reservation findReservationById(int id);

	
}


