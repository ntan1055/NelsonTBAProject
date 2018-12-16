package Rooms;

import People.Person;

public class exitLevel
{
    Person explorer;
    int xLoc,yLoc;

    public exitLevel(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterCave(Person x)
    {
        System.out.println("As you look across the level you are in, you see this gap with light shining through. Surely that must be the exit of the cave. Go for it!");
        explorer = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public void goUp(Person x)
    {
        explorer = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveCave(Person x)
    {
        explorer = null;
    }
}
