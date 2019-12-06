package main;

import java.util.Random;

public class TreasureCoordinate {
	
	private Random rand = new Random();
			
	public int getTreasureXCoord() {
		int xTreasure = rand.nextInt(10);
		return xTreasure;
	}
	public int getTreasureYCoord() {
		int yTreasure = rand.nextInt(10);
		return yTreasure;
	}

				
}
