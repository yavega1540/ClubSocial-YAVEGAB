package ui;

import java.util.Scanner;

import bll.Application;
import dol.Employee;

public class EmployeeMenu {
	private Scanner scan = new Scanner(System.in);
	
	public void displayoptions() {
		System.out.println("Gestionar Empleados");
		System.out.println("1.Agregar Empleados");
		System.out.println("2.Mostrar Empleados");
		System.out.println("3.Volver");
		
	}

	public void show() {
		short opc = 0;
		Menu menu = new Menu();
		
		do {
			System.out.println();
			displayoptions();
			System.out.println();
			opc = scan.nextShort();
			switch (opc) {
				case 1:
					Application.saveEmployee();
					break;
				case 2:
					Application.showEmployees();
					break;
				case 3:
					menu.show();
					break;
				default:
					System.out.println("Opcion invalida");
					break;
			}
		}while(opc!=3);
		
	}
	
	public Employee saveEmployee() {
		
		Employee e = new Employee();
		
		System.out.println("Primer nombre: ");
		e.setFirstName(scan.next());
		
		System.out.println("Segundo nombre: ");
		e.setsecondName(scan.next());
		
		System.out.println("Primer apellido: ");
		e.setSurName(scan.next());
		
		System.out.println("Segundo apellido: ");
		e.setSecondSurname(scan.next());
		
		System.out.println("Edad: ");
		e.setBirthdate(scan.next());
		
		System.out.println("Genero: ");
		e.setGender(scan.next());
		
		System.out.println("Numero de empleado: ");
		e.setEmployeeNumber(scan.next());
		
		System.out.println("Fecha de ingreso: ");
		e.setEmployeedate(scan.next());
		
		System.out.println("Puesto de trabajo: ");
		e.setworkPosition(scan.next());
		
		return e;
	}


}
