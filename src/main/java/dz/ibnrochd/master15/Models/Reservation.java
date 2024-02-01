package dz.ibnrochd.master15.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(schema = "eventspace", name = "reservation")
public class Reservation {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
	@Column(name = "motif", length = 255)
    private String motif;
	
	@Column(name = "date_reservation", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date_reservation;
	
	 @ManyToOne()
	    @JoinColumn(name = "id_person", nullable = false)
	    private Person person;
	 
	 @OneToMany()
	   // private Set<LigneReservation> LigneReservations;
	   private List<LigneReservation> ligneReservations = new ArrayList<>();
	
	public Reservation() {
		super();
	}

	public Reservation(int id, String motif, Date date_reservation, Person person) {
		super();
		this.id = id;
		this.motif = motif;
		this.date_reservation = date_reservation;
		this.person = person;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	/**
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/**
	 * @return the date_reservation
	 */
	public Date getDate_reservation() {
		return date_reservation;
	}

	/**
	 * @param date_reservation the date_reservation to set
	 */
	public void setDate_reservation(Date date_reservation) {
		this.date_reservation = date_reservation;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	public List<LigneReservation> getLigneReservations() {
		return ligneReservations;
	}

	public void setLigneReservations(List<LigneReservation> ligneReservations) {
		this.ligneReservations = ligneReservations;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}


}
