package main;

import java.util.Random;

public class PlayerCoordinate {
	
	public int newXPlayerCoord;
	public int newYPlayerCoord;
	
	private Random rand = new Random();
	
	public int getPlayerXCoord() {
		int xPlayer = rand.nextInt(10);
		return xPlayer;
	}
	public int getPlayerYCoord() {
		int yPlayer = rand.nextInt(10);
		return yPlayer;
	}
}
	
	
	
	/*
	private int getNewPlayerXCoord() {
		newXPlayerCoord = xPlayer.getPlayerXCoord() +
		
		*/
		
		
	
