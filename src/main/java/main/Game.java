package main;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Game {

	private int totalGames;
	private int xDistance;
	private int yDistance;
	private double questDistance;
	private boolean treasureFound;

	public String playQuest(Scanner s) {
		Compass playerMove = null;
		TreasureCoordinate xTreasure = getTreasureXCoord();
		TreasureCoordinate yTreasure = getTreasureYCoord();
		PlayerCoordinate xPlayer = getPlayerXCoord();
		PlayerCoordinate yPlayer = getPlayerYCoord();
		
		if (xPlayer.getPlayerXCoord() > xTreasure.getTreasureXCoord()) {
			xDistance = (xPlayer.getPlayerXCoord() - xTreasure.getTreasureXCoord());
		}
		else {
			xDistance = (xTreasure.getTreasureXCoord() - xPlayer.getPlayerXCoord());
		}
		
		if (yPlayer.getPlayerYCoord() > yTreasure.getTreasureYCoord()) {
			yDistance = (yPlayer.getPlayerYCoord() - yTreasure.getTreasureYCoord());
		}
		else {
			yDistance = (yTreasure.getTreasureYCoord() - yPlayer.getPlayerYCoord());
		}
		questDistance = Math.sqrt((Math.pow((xDistance, 2)) + Math.pow(yDistance, 2)));
		
		System.out.println("blah blah context");
		System.out.println("You notice that the dial on the device reads " + questDistance); {
		
		do {
			System.out.println("Choose your direction of travel - NORTH, EAST, SOUTH or WEST...");
			playerMove = getPlayerMove(s.nextLine());
		} while (playerMove == null);
		System.out.println("Travel " + playerMove);
		String outcome = getNewPlayerCoord(playerMove, xPlayer, yPlayer);
		return outcome;
		}
	}					
		private String getNewPlayerCoord(Compass playerMove, PlayerCoordinate xPlayer, PlayerCoordinate yPlayer) {
			switch (playerMove) {
			case NORTH:
				return 
			case EAST:
				return
			case SOUTH:
				return
			case WEST:
				return
				
					
		return null; }
			
			if (questDistance == 0) {
				treasureFound = true;
				System.out.println("You win!");
			}
			else treasureFound = false;
				
	}

		private TreasureCoordinate getTreasureXCoord() {
			return null;
		}
		private TreasureCoordinate getTreasureYCoord() {
			return null;
		}
		private PlayerCoordinate getPlayerXCoord() {
			return null;
		}
		private PlayerCoordinate getPlayerYCoord() {
			return null;
		}


			
		
		
		public Compass getPlayerMove(String choice) {
			switch (choice.toLowerCase()) {
			case "north":
				return Compass.NORTH;
			case "east":
				return Compass.EAST;
			case "south":
				return Compass.SOUTH;
			case "west":
				return Compass.WEST;
			default:
				return null;
			}
		}
		
		
		
		public void start() {
			Scanner s = new Scanner(System.in);
			boolean play = true;
			do {
				System.out.println(playQuest(s));
				System.out.println("Enter 'q' to quit or anything else to play again: ");
				play = checkContinue(s.nextLine());
			} while (play);
			System.out.println(this.toString());
		}
		
		private boolean checkContinue(String choice) {
			return !choice.equalsIgnoreCase("q");
		}

		@Override
		public String toString() {
			return "Total Games: " + totalGames;
		}	
			
		

}

	
