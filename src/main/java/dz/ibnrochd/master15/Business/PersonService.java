package dz.ibnrochd.master15.Business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dz.ibnrochd.master15.Dao.PersonRepository;
import dz.ibnrochd.master15.Models.Person;

@Service
public class PersonService implements IPersonService{

	@Autowired
	PersonRepository personRepository;
	
	/**
	 * Récupérer tous les persons
	 */
	public List<Person> findAllPersons() {
		return personRepository.findAll();
	}
	
	/**
	 * Créer un person
	 */
	
	public Person creerPerson(Person person) {
		return personRepository.save(person);
	}
	
	/**
	 * Modifier un person
	 */
	
	public void modifierPerson(int id, Person person) {		
		 Person p;
		 
			Optional <Person> optionalPerson = personRepository.findById(id);
			if (optionalPerson.isPresent()) {
				
			    p = optionalPerson.get();
			    p.setAdresse(person.getAdresse());
				p.setReservations(person.getReservations());
				p.setDateNaissance(person.getDateNaissance());
				p.setNom(person.getNom());
				p.setNumeroTelephone(person.getNumeroTelephone());
				p.setPrenom(person.getPrenom());
				p.setRendezVous(person.getRendezVous());
				p.setSexe(person.getSexe());
				personRepository.save(p);
			}
			
			else System.out.print("person est non existant");	
			
		
	}

	/***
	 * Trouver un person
	 */
	
	 public Person findPerson(int id) {
		 Person p=null;
		 
			Optional <Person> optionalPerson = personRepository.findById(id);
			if (optionalPerson.isPresent()) {
				 p = optionalPerson.get();
			}
		return p;
	    }

	 /**
		 * Supprimer un person
		 */
	
	
	@Override
	public void supprimerPerson(int id) {
		if (id > 0) {
			 
			Person p;
			
			Optional <Person> optionalEntity = personRepository.findById(id);
			if (optionalEntity.isPresent()) {
				System.out.print("person is present" );
			    p = optionalEntity.get();
			  				
			    personRepository.delete(p);	
			}
			
			else System.out.print("Aucun person ayant le id n'est trouvé");	
		}
		else System.out.print("Le id est non existant ");	
		
	}
	


}
