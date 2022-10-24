package dol;

public class Person {
	private String firstName;
	private String secondName;
	private String surName;
	private String secondSurname;
	private String gender;
	private String birthdate;
	
	public Person() {
		
	}

	public Person(String firstName, String secondName, String surName, String secondSurname, String gender, String birthdate) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.surName = surName;
		this.secondSurname = secondSurname;
		this.gender = gender;
		this.birthdate = birthdate;	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getsecondName() {
		return secondName;
	}

	public void setsecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	

}
