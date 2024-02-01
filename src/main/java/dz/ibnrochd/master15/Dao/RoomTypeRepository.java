package dz.ibnrochd.master15.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dz.ibnrochd.master15.Models.RoomType;

@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType, Integer> 
{
	//RendezVous findById(int id);

}
