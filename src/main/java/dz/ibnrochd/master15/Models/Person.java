package dz.ibnrochd.master15.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(schema = "eventspace", name = "person")
public class Person  {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom", nullable = false, length = 255)
    private String nom;

    @Column(name = "prenom", nullable = false, length = 255)
    private String prenom;

    @Column(name = "sexe", nullable = false, length = 1)
    private String sexe;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd") // Corrected date format
    @Column(name = "date_naissance", nullable = false)
    private Date dateNaissance;

    @Column(name = "numero_telephone", nullable = false, length = 255)
    private String numeroTelephone;

    @Column(name = "adresse", nullable = false, length = 255)
    private String adresse;
        
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Reservation> reservations;
    
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<RoomType> rendezVous = new ArrayList<>();
    
    /////////////////////////////////////////////////////////
    
    public Person() {		
	}
    
	public Person(String nom, String prenom, String sexe, Date dateNaissance, String numeroTelephone,
			String adresse) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.numeroTelephone = numeroTelephone;
		this.adresse = adresse;
	}
	
	//////////////////////////////////////////////////////
	@NotNull
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@NotNull
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@NotNull
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@NotNull
	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@NotNull
	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {

		Date currentDate = new Date();
		if (dateNaissance.before(currentDate))  this.dateNaissance = dateNaissance;
		else this.dateNaissance = currentDate;
	}

	@NotNull
	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	@NotNull
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	
	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public List<RoomType> getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(List<RoomType> rendezVous) {
		this.rendezVous = rendezVous;
	}

	
}
