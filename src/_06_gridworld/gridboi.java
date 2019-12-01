package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridboi {
public static void main(String[] args) {
	
 World gridyeet = new World();
gridyeet.show();

Bug buggiboi = new Bug();
buggiboi.setColor(Color.green);
Location GPS = new Location(2,3);
gridyeet.add(GPS , buggiboi);
	Random rand = new Random();
Location GPSX = new Location(rand.nextInt(10), rand.nextInt(10));
gridyeet.add(GPSX, buggiboi);
buggiboi.turn();	
	buggiboi.turn();
	
	Flower hiImflowey = new Flower();
	Flower flowey = new Flower();
Location GPSonmandrones = new Location(1,3);	
Location Lasersights = new Location(3,3);
gridyeet.add(GPSonmandrones, flowey);
gridyeet.add(Lasersights, hiImflowey);

for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 10; j++) {
		Flower twohundredgraves = new Flower();
		Location herewegoagain = new Location(i,j);
		gridyeet.add(herewegoagain, twohundredgraves);
	}
}












































































































}
}
