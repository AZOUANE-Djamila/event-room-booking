package dz.ibnrochd.master15.Business;

import java.util.List;

import dz.ibnrochd.master15.Models.Person;

public interface IPersonService {
	
	void modifierPerson(int id,Person patient);
	void supprimerPerson(int id);
	List<Person> findAllPersons();
	Person creerPerson(Person patient);
	Person findPerson(int id);
	
	
}
