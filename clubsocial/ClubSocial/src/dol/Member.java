package dol;

public class Member extends Person {

	private String membershipNumber;
	private String membershipIssue;
	private String membershipExpiration;
	
	public Member() {
		
	}
	
	public Member(String firstName, String secondName, String surName, String secondSurname, String gender, String birthdate, String membershipissue, String membershipexpiration) {
		super(firstName, secondName, surName, secondSurname, gender, birthdate);
	}

	
	public Member(String firstName, String secondName, String surName, String secondSurname, String gender,String membershipNumber, String birthdate, String membershipissue, String membershipexpiration) {
		super(firstName, secondName, surName, secondSurname, gender, birthdate);
		this.membershipNumber = membershipNumber;
		this.membershipIssue = membershipissue;
		this.membershipExpiration = membershipexpiration;
		
	}


	public String getMembershipNumber() {
		return membershipNumber;
	}

	public void setMembershipNumber(String membershipNumber) {
		this.membershipNumber = membershipNumber;
	}

	public String getMembershipIssue() {
		return membershipIssue;
	}

	public void setMembershipIssue(String membershipIssue) {
		this.membershipIssue = membershipIssue;
	}

	public String getMembershipExpiration() {
		return membershipExpiration;
	}

	public void setMembershipExpiration(String membershipExpiration) {
		this.membershipExpiration = membershipExpiration;
	}

	public void show1() {
		System.out.printf("\n%s %s %s %s %s %s %s \n",
				getMembershipNumber(),
				getMembershipIssue(),
				getMembershipExpiration(),
				getFirstName(), 
				getsecondName(),
				getSurName(),
				getSecondSurname(),
				getGender()
			);
		System.out.println("===================================================================================");
		
	}

	public void show2() {
		System.out.printf("\nNumero de membresia: %s", getMembershipNumber());
		System.out.printf("\nFecha de emision de la membresia: %s", getMembershipIssue());
		System.out.printf("\nFecha de expiracion de la membresia: %s", getMembershipExpiration());
		System.out.printf("\nPrimer nombre: %s", getFirstName());
		System.out.printf("\nSegundo nombre: %s", getsecondName());
		System.out.printf("\nPrimer apellido: %s", getSurName());
		System.out.printf("\nSegundo apellido: %s", getSecondSurname());
		System.out.printf("\nFecha de nacimiento: %s", getBirthdate());
		System.out.printf("\nGenero: %s", getGender());
		System.out.println();
	}


}
