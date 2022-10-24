package dol;

import java.util.ArrayList;
import java.util.List;

public class Pp {
	private List<Member> members;
	private List<Employee> employees;
	public Pp() {
		members = new ArrayList<Member>();
		employees = new ArrayList<Employee>();
	}
	public Pp(List<Member> members, List<Employee> employees) {
		super();
		this.members = members;
		this.employees = employees;
	}
	
	public List<Member> getMembers() {
		return members;
	}
	public void setMembers(List<Member> members) {
		this.members = members;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public void addEmployee(Employee e) {
		this.employees.add(e);
	}
	public void addMember(Member m) {
		this.members.add(m);
	}
	public void showMembers() {
		System.out.println("===================================================================================");
		System.out.printf("\nLista de miembros del Club ");
		System.out.println("\n===================================================================================");
		for(int i=0; i<members.size();i++) {
			members.get(i).show2();
		}
	}
	public void showEmployees() {
		System.out.println("===================================================================================");
		System.out.printf("\nLista de empleados del Club ");
		System.out.println("\n===================================================================================");
		for(int i=0; i<employees.size();i++) {
			employees.get(i).show1();
		}
	}
}
