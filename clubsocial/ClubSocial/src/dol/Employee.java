package dol;

public class Employee extends Person {
	private String employeeNumber;
	private String workPosition;
	private String employeedate;
	
	public Employee() {
		super();
	}
	public Employee(String firstName, String secondName, String surName, String secondSurname, String gender, String birthdate, String employeedate) {
		super(firstName, secondName, surName, secondSurname, gender, birthdate);

	}
	
	public Employee(String firstName, String secondName, String surName, String secondSurname, String gender, String employeeNumber, String workPosition, String birthdate, String employeedate) {
		super(firstName, secondName, surName, secondSurname, gender, birthdate);
		this.employeeNumber = employeeNumber;
		this.workPosition = workPosition;
		this.employeedate = employeedate;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getworkPosition() {
		return workPosition;
	}

	public void setworkPosition(String workPosition) {
		this.workPosition = workPosition;
	}
	
	public String getEmployeedate() {
		return employeedate;
	}
	public void setEmployeedate(String employeedate) {
		this.employeedate = employeedate;
	}
	public void show1() {
		System.out.printf("\n%s %s %s %s %s %s %s %s \n",
				getEmployeeNumber(),
				getFirstName(), 
				getsecondName(),
				getSurName(),
				getSecondSurname(),
				getGender(),
				getEmployeedate(),
				getworkPosition()
				);
		System.out.println("===================================================================================");
		
	}

	public void show2() {
		        System.out.printf("\nNumero de empleado: %s", getEmployeeNumber());
				System.out.printf("\nPrimer nombre: %s", getFirstName());
				System.out.printf("\nSegundo nombre: %s", getsecondName());
				System.out.printf("\nPrimer apellido: %s", getSurName());
				System.out.printf("\nSegundo apellido: %s", getSecondSurname());
				System.out.printf("\nFecha de nacimiento: %s", getBirthdate());
				System.out.printf("\nGenero: %s", getGender());
				System.out.printf("\nFecha de ingreso %s", getEmployeedate());
				System.out.printf("\nPuesto de trabajo %s", getworkPosition());
		        System.out.println();
	}
}
