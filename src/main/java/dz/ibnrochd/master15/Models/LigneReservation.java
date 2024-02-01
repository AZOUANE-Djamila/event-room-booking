package dz.ibnrochd.master15.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(schema = "eventspace", name = "ligne_reservation")


public class LigneReservation {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	 
    @ManyToOne()
    @JoinColumn(name = "id_room", nullable = false)
    private Room room;
	 
	 @ManyToOne()
	 @JoinColumn(name = "id_reservation", nullable = false)
	    private Reservation reservation;
	 
	 @Column(name = "posologie", nullable = false, length = 255)
	 private String posologie;
	 
	 @Column(name = "unite_temps", nullable = false, length = 255)
	 private String unite_temps;
	 
	 @Column(name = "quantite", nullable = false, length = 255)
	 private String quantite;
	
	 public LigneReservation() {
			super();		
		}
	public LigneReservation(int id, Reservation reservation, Room room, String posologie,
			String unite_temps, String quantite) {
		super();
		this.id = id;
		this.reservation = reservation;
		this.room = room;
		this.posologie = posologie;
		this.unite_temps = unite_temps;
		this.quantite = quantite;
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
	 * @return the id_room
	 */
	public Room getRoom() {
		return room;
	}
	/**
	 * @param id_room the id_room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
	}
	/**
	 * @return the posologie
	 */
	public String getPosologie() {
		return posologie;
	}
	/**
	 * @param posologie the posologie to set
	 */
	public void setPosologie(String posologie) {
		this.posologie = posologie;
	}
	/**
	 * @return the unite_temps
	 */
	public String getUnite_temps() {
		return unite_temps;
	}
	/**
	 * @param unite_temps the unite_temps to set
	 */
	public void setUnite_temps(String unite_temps) {
		this.unite_temps = unite_temps;
	}
	/**
	 * @return the quantite
	 */
	public String getQuantite() {
		return quantite;
	}
	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	
	 
	 
}
