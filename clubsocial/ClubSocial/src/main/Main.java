package main;

import java.util.Scanner;

import ui.Menu;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		menu.show();
	}

}