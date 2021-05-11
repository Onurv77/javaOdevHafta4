package entities;

import java.time.LocalDate;

import abstracts.Entity;

public class Customer implements Entity{
	private int id;
	private String firstName;
	private String LastName;
	private LocalDate dateOfBirth;
	private String nationalityId;
	
	public Customer() {}
	
	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public String getNationalityId() {
		return nationalityId;
	}
}
