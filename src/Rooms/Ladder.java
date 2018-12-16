package Rooms;

import Game.Runner;
import People.Person;

public class Ladder extends Room
{
	public Ladder(int x, int y)
	{
		super(x, y);
	}
	@Override
	public void enterCave(Person x) {
		explorer = x;
		x.setxLoc(0);
		x.setyLoc(0);
		System.out.println("You found the ladder to move down to the lower floor.");
		Runner.switchRoom();
	}
}
