/**
 * @author AZOUANE DJAMILA
 *
 */
package dz.ibnrochd.master15.Business;

import java.util.List;

import dz.ibnrochd.master15.Models.Reservation;
import dz.ibnrochd.master15.Models.Person;


public interface IReservationService {

	List<Reservation> listeDesReservations();
	void creerReservation(Reservation reservation);
	void modifierReservation(Reservation reservation);
	void supprimerReservations(Reservation reservation);
	List<Reservation> listeReservationsParPerson(Person person);
}
