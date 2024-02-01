package dz.ibnrochd.master15;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dz.ibnrochd.master15.Business.IPersonService;
import dz.ibnrochd.master15.Business.IRoomService;
import dz.ibnrochd.master15.Models.Person;


@RestController
public class EventSpaceBookingApiController {

	@Autowired
	private IPersonService ipersonService;
	
	@Autowired
	private IRoomService iRoomService;
	
	
	 @RequestMapping(value = "/api/rooms")
		public ResponseEntity<Object> ListReservations() {

	    
	     return new ResponseEntity<>(iRoomService.findAllRooms(),HttpStatus.OK);
				
		}
	   @RequestMapping(value = "/api/persons")
		public ResponseEntity<Object> ListPersons() {

         List<Person> liste = ipersonService.findAllPersons();
         
	     return new ResponseEntity<>(liste,HttpStatus.OK);
				
		}
	   
	   
	   @RequestMapping(value = "/api/ajouter-person",method = RequestMethod.POST)
		public ResponseEntity<Object> AjouterPerson(@RequestBody Person person) {

         ipersonService.creerPerson(person);
        
	     return new ResponseEntity<>("Bravo ! Le person est ajouté avec succès ! ",HttpStatus.CREATED);
				
		}
	   
	   @RequestMapping(value = "/api/modifier-person/{id}",method = RequestMethod.PUT)
		public ResponseEntity<Object> ModifierPerson(@PathVariable("id") int id ,@RequestBody Person person) {
		  
        ipersonService.modifierPerson(id, person);
       
	     return new ResponseEntity<>("Bravo ! Le person est modifié avec succès !",HttpStatus.OK);
				
		}
	   
	   @RequestMapping(value = "/api/supprimer-person/{id}",method = RequestMethod.DELETE)
	 		public ResponseEntity<Object> SupprimerPerson(@PathVariable("id") int id) {
	         ipersonService.supprimerPerson(id);
	        
	 	     return new ResponseEntity<>("Person supprimé avec succès",HttpStatus.OK);
	 				
	 		}
	   
	   
}