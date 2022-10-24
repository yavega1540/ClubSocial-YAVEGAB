package ui;

import java.util.Scanner;

import bll.Application;
import dol.Member;

public class MemberMenu {
	private Scanner scan = new Scanner(System.in);
	
	public void displayoptions() {
		System.out.println("Gestionar de Miembros");
		System.out.println("1.Agregar Miembros");
		System.out.println("2.Mostrar miembros");
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
					Application.saveMember();;
					break;
				case 2:
					Application.showMembers();;
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
	public Member saveMember() {
		
		Member m = new Member();
		
		System.out.println("Primer nombre: ");
		m.setFirstName(scan.next());
		
		System.out.println("Segundo nombre: ");
		m.setsecondName(scan.next());
		
		System.out.println("Primer apellido: ");
		m.setSurName(scan.next());
		
		System.out.println("Segundo apellido: ");
		m.setSecondSurname(scan.next());
		
		System.out.println("Edad: ");
		m.setBirthdate(scan.next());
		
		System.out.println("Genero: ");
		m.setGender(scan.next());
		
		
		System.out.println("Numero de membresia: ");
		m.setMembershipNumber(scan.next());
		
		System.out.println("Fecha de emision de la membresia: ");
		m.setMembershipIssue(scan.next());
		
		System.out.println("Numero de expiracion de la membresia: ");
		m.setMembershipExpiration(scan.next());
		
		return m;
	}

}
