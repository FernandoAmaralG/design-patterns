package training.proxy.solution;

import java.time.LocalDate;

import training.builder.Person;
import training.proxy.PersonService;

public class PersonProxyTest {

	public static void main(String[] args) {

		PersonService personService = new PersonService(new PersonRepositoryProxy());

		Person person = new Person.PersonBuilder().surname("Amaral").birthdayDate(LocalDate.of(1998, 05, 19))
				.name("Fernando").alias("Fer").document("12338670671").build();

		personService.save(person);

		Person returnPerson = personService.findById(1L);
		System.out.println(returnPerson);
		
		Person returnPersonCache = personService.findById(1L);
		System.out.println(returnPersonCache);

	}

}
