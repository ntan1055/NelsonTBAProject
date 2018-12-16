package Rooms;

import Game.Runner;
import People.Person;

public class Exit extends exitLevel
{
    public Exit(int x, int y)
    {
        super(0, 0);
    }
    @Override
    public void enterCave(Person x) {
        explorer = x;
        x.setxLoc(0);
        x.setyLoc(0);
        System.out.println("You are finally at the exit with the treasures. You exit to start a new life.");
        Runner.gameOff();
    }
}
