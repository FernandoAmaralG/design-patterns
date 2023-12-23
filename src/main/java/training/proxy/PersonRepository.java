package training.proxy;

import java.util.HashMap;
import java.util.Map;

import training.builder.Person;

public class PersonRepository {
	
	private Map<Long, Person> dataBase = new HashMap<>();
	
	private static Long countId = 1L;
	
	public void save(Person person) {
		dataBase.put(countId++, person);
	}
	
	public Person findById(Long id) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return dataBase.get(id);
	}
	
}
