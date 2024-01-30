package dz.ibnrochd.master15.Models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "eventspace",name = "rendez_vous")
public class RendezVous{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "date_rdv", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRdv;

    @ManyToOne()
    @JoinColumn(name = "id_person", nullable = false)
    private Person person;

    //////////////////////////////////////////////
    
    public RendezVous() {
		
	}

	public RendezVous(long id, Date dateRdv, Person person) {
		super();
		this.id = id;
		this.dateRdv = dateRdv;
		this.person = person;
	}

	///////////////////////////////////////////////
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDateRdv() {
		return dateRdv;
	}

	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
    
    
}
