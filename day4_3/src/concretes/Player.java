package concretes;

import java.time.LocalDate;

import abstracts.Entity;

public class Player implements Entity {

	private int playerId;
	private String nationalId;
	private String firstName;
	private String lastName;
	private String userName;
	private LocalDate dateOfBirth;
	
	
	public Player() {}
	public Player(int playerId, String nationalId, String firstName, String lastName, String userName,
			LocalDate dateOfBirth) {
		this.playerId = playerId;
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
	
	
}
