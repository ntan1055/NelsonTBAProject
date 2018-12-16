package Rooms;

import Game.Runner;
import People.Person;

public class Door extends lowerLevel
{
    public Door(int x, int y)
    {
        super(x,y);
    }
    @Override
    public void enterCave(Person x)
    {
        explorer = x;
        x.setxLoc(0);
        x.setyLoc(0);
        System.out.println("You encounter a strange door and open it. In doing so, you discover a sea of treasures that's for your taking.");
        System.out.println("You stash all the treasures in your inventory and go back to the ladder.");
        Runner.goUp();
    }
}
