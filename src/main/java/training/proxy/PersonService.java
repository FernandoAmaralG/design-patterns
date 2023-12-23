package training.proxy;

import training.builder.Person;
import training.proxy.solution.PersonRepositoryProxy;

public class PersonService {

	private PersonRepositoryProxy personRepositoryProxy;
	
	public PersonService(PersonRepositoryProxy personRepositoryProxy) {
		
		this.personRepositoryProxy = personRepositoryProxy;
		
	}
	
	public void save(Person person) {
		
		personRepositoryProxy.save(person);
		
	}
	
	public Person findById(Long id) {
		
		return personRepositoryProxy.findById(id);
		
	}
	
}
