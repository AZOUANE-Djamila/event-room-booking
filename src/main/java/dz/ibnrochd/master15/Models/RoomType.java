package dz.ibnrochd.master15.Models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(schema = "eventspace",name = "room_type")
public class RoomType{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "date_rdv", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRdv;

    @ManyToOne()
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

	private String type;

    //////////////////////////////////////////////
    
    public RoomType() {
		
	}

	public RoomType(long id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	///////////////////////////////////////////////
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
    
}
