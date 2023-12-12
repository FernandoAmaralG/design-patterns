package training.builder;

import java.time.LocalDate;

import training.builder.solution.PersonBuilder;

public class Person {
	
	private String name;
	
	private String surname;
	
	private String document;
	
	private String email;
	
	private String alias;
	
	private LocalDate birthdayDate;

	private Person(String name, String surname, String document, String email, String alias, LocalDate birthdayDate) {
		this.name = name;
		this.surname = surname;
		this.document = document;
		this.email = email;
		this.alias = alias;
		this.birthdayDate = birthdayDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public LocalDate getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(LocalDate birthdayDate) {
		this.birthdayDate = birthdayDate;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", document=" + document + ", email=" + email
				+ ", alias=" + alias + ", birthdayDate=" + birthdayDate + "]";
	}
	
	public static class PersonBuilder {

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

		public Person build() {
			return new Person(name, surname, document, email, alias, birthdayDate);
		}
		
	}
		
}
