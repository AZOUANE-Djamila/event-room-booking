package dz.ibnrochd.master15.Models;
import java.util.ArrayList;
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


@Entity
@Table(schema = "eventspace", name = "room")
public class Room {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom", nullable = false, length = 255)
    private String nom;
    
    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private RoomType roomType;


    @OneToMany(mappedBy = "room")
    private List<LigneReservation> ligneReservations = new ArrayList<>();
    
    //////////////////////////////////////
    
    public Room() {
	
	}

	public Room(int id, String nom, RoomType roomType) {
		super();
		this.id = id;
		this.nom = nom;
		this.roomType = roomType;
	}
	
	///////////////////////////////////////

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public List<LigneReservation> getLigneReservations() {
		return ligneReservations;
	}

	public void setLigneReservations(List<LigneReservation> ligneReservations) {
		this.ligneReservations = ligneReservations;
	}
    
    
}
