package ui;

import java.util.Scanner;

public class Menu {

	public void displayOptions() {
		
		System.out.println("Datos de Club social");
		System.out.println("\n1.Empleados");
		System.out.println("2.Miembros");
		System.out.println("3.Salir");
		 
		System.out.println("\nPor favor, digite un numero: ");
	} 
	
	public void show() {
		Scanner scan = new Scanner(System.in);
		short opc = 0;
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			opc = scan.nextShort();
			switch (opc) {
				case 1:
					EmployeeMenu em = new EmployeeMenu();
					em.show();
					break;
				case 2:
					MemberMenu mm = new MemberMenu();
					mm.show();
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("Opcion invalida");
					break;
			}
		}while(opc!=3);
		
	}
	
}
