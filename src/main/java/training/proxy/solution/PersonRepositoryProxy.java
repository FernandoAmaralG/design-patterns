package training.proxy.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import training.builder.Person;
import training.proxy.PersonRepository;

public class PersonRepositoryProxy extends PersonRepository {
	
	private static Logger log = Logger.getLogger(PersonRepositoryProxy.class.getName());

	private Map<Long, Person> cache = new HashMap<>();
	
	@Override
	public void save(Person person) {
		log.info("Starting save method...");
		super.save(person);
		log.info("Save method finalized.");
	}
	
	@Override
	public Person findById(Long id) {
		log.info("Starting findById method...");
		
		long start = System.currentTimeMillis();
		
		Person person = null;
		
		if (Objects.nonNull(cache.get(id))) {
			log.info("Catching ID in cache.");
			person = cache.get(id);
		} else {
			log.info("Catching in PessoaRepository.");
			person = super.findById(id);
			cache.put(id, person);
		}
		
		log.info("FindById method finalized.");
		long end = System.currentTimeMillis();
		
		log.info("Time expent on call... " + (end - start));
		
		return person;
	}
	
}
