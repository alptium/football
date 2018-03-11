package com.alptium.football;

public class Team {

	private String result;
	private String fixtures;
	private String squad;
	
	public Team(String result, String fictures, String squad) {
		this.result = result;
		this.fixtures = fictures;
		this.squad = squad;
	}	
		
		public String getResult() {
			return result;		
		}
		
		public String getFictures() {
			return fixtures;		
		}
		
		public String getSquad() {
			return squad;		
		}
}
