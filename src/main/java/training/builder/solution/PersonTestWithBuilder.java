package training.builder.solution;

import java.time.LocalDate;

import training.builder.Person;

public class PersonTestWithBuilder {

	public static void main(String[] args) {
		
		Person person = new Person.PersonBuilder()
				.name("Fernando")
				.surname("do Amaral Guimarães")
				.document("12312312312")
				.email("fernandoaguimaraes98@gmail.com")
				.alias("Fer")
				.birthdayDate(LocalDate.of(1998, 05 , 19))
				.build();
		
		System.out.println(person);
				
	}
	
}
