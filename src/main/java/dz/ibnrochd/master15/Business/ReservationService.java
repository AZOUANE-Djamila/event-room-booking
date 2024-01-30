package dz.ibnrochd.master15.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master15.Models.Person;
import dz.ibnrochd.master15.Models.Reservation;

import dz.ibnrochd.master15.Dao.LigneReservationRepository;
import dz.ibnrochd.master15.Dao.ReservationRepository;




@Service
public class ReservationService implements IReservationService{
	
	@Autowired
	Reservation Reservation;

	@Autowired
	ReservationRepository reservationRepository;
	
	@Autowired
	LigneReservationRepository ligneReservationRepository;

	
	public void Reservation(ReservationRepository reservationRepository) {
		//super();
		this.reservationRepository = reservationRepository;
	}
	
	/**
	 * Récupérer la liste de toutes les reservations
	 */
	public List<Reservation> listeDesReservations() {
		return reservationRepository.findAll();
	}

	/**
	 * Créer une reservation
	 */
	public void creerReservation(Reservation reservation) {
		reservationRepository.save(reservation);		
	}

	/**
	 * Modifier une reservation en possédant l'objet
	 */
	public void modifierReservation(Reservation reservation) {
		reservationRepository.save(reservation);
	}

	/**
	 * Supprimer une reservation donnée	
	 */
	public void supprimerReservations(Reservation reservation) {
		reservationRepository.delete(reservation);		
	}


	/**
	 * 
	 * @param idC le id unique de la reservation à rechercher
	 * @return La reservation qui posséde le id en parametre
	 */
	public Reservation trouverReservationById(int idC) {
		return reservationRepository.findReservationById(idC);
	}

	@Override
	public List<Reservation> listeReservationsParPerson(Person person) {
		return reservationRepository.findByPerson(person);
	}


}
