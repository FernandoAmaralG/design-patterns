package training.builder.solution;

import java.time.LocalDate;

public class PersonBuilder {

	private String name;

	private String surname;

	private String document;

	private String email;

	private String alias;

	private LocalDate birthdayDate;

	public PersonBuilder name(String name) {
		this.name = name;
		return this;
	}

	public PersonBuilder surname(String surname) {
		this.surname = surname;
		return this;
	}

	public PersonBuilder document(String document) {
		this.document = document;
		return this;
	}

	public PersonBuilder email(String email) {
		this.email = email;
		return this;
	}

	public PersonBuilder alias(String alias) {
		this.alias = alias;
		return this;
	}

	public PersonBuilder birthdayDate(LocalDate birthdayDate) {
		this.birthdayDate = birthdayDate;
		return this;
	}

	/*public Person createPerson() {
		return new Person(name, surname, document, email, alias, birthdayDate);
	}*/
	
}
