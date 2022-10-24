package bll;

import dol.Pp;
import dol.Employee;
import dol.Member;
import ui.EmployeeMenu;
import ui.MemberMenu;

public final class Application {

	public static Pp socialClub = new Pp();
	public static void addEmployee(Employee e) {
		socialClub.addEmployee(e);
		
	}
	public static void saveEmployee() {
		EmployeeMenu em = new EmployeeMenu();
		addEmployee(em.saveEmployee());
		
	}
	public static void showEmployees() {
		socialClub.showEmployees();
		
	}
	public static void addMember(Member m) {
		socialClub.addMember(m);
		
	}
	public static void saveMember() {
		MemberMenu mm = new MemberMenu();
		addMember(mm.saveMember());
		
	}
	public static void showMembers() {
		socialClub.showMembers();
		
	}
}
