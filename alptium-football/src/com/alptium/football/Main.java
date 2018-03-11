package com.alptium.football;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
		
		System.out.println("Welcome to Alptium Football application");
		System.out.println("If you want to go to < PLAYERS > page, enter P");
		System.out.println("If you want to go to < TEAMS > page, enter T");
		System.out.println("If you want to go to < LEAGUES > page, enter L");
		System.out.println("If you want to go to < COUNTRIES > page, enter C");		
		
		System.out.println("Please, enter the path for your choise!");
		
		String choise = sc.next();
			  
		if(choise.equals("P") || choise.equals("p")) {
			 runPlayer(); 
		} else if(choise.equals("T") || choise.equals("t") ) {
			 runTeam();
		} else if(choise.equals("L") || choise.equals("l")) {
			 runLeague();		
		} else if(choise.equals("C") || choise.equals("c")) {
			 runCountry();
		} else while (!choise.equals("P") && !choise.equals("p") && !choise.equals("T") && !choise.equals("t") && !choise.equals("L") && !choise.equals("l") && !choise.equals("C") && !choise.equals("c")) {
			System.out.println("THE PATH YOU ENTERED IS INCORRECT!");
			
			 System.out.println("Please, TRY AGAIN");
			 System.out.println();
			 choise = sc.next();
		 }
		 
	}		
		
}
	
	private static void runPlayer() {

		System.out.println("Welcome to the page PLAYERS");
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the player's name");
			String name = scanner.next();
			
			System.out.println("Enter the player's surname");
			String surname = scanner.next();
			
			System.out.println("Enter the player's age");
			int age = scanner.nextInt();
			
			System.out.println("Enter the player's position");
			String position = scanner.next();
			
			System.out.println("Enter the player's team");
			String team = scanner.next();
			
			Player player = new Player(name, surname, age, position, team);
			
			System.out.println("=============================================");
			System.out.println("Name: " + player.getName());
			System.out.println("Surname: " + player.getSur());
			System.out.println("Age: " + player.getAge());
			System.out.println("Position: " + player.getPosition());
			System.out.println("Team: " + player.getTeam());
			System.out.println("=============================================");
		}
}
	
	private static void runTeam() {

		System.out.println("Welcome to the page TEAMS");
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the team's result");
			String result = scanner.next();
			
			System.out.println("Enter the team's fictures");
			String fictures = scanner.next();
			
			System.out.println("Enter the team's squad");
			String squad = scanner.next();
		
			Team team = new Team(result, fictures, squad);
			
			System.out.println("=============================================");
			System.out.println("Result: " + team.getResult());
			System.out.println("Fictures: " + team.getFictures());
			System.out.println("Squad: " + team.getSquad());
			System.out.println("=============================================");
		}

	}
	
	private static void runLeague() {

		System.out.println("Welcome to the page LEAGUES");

	}
	
	private static void runCountry() {

		System.out.println("Welcome to the page COUNTRIES");

	}

}

