package Rooms;

import People.Person;

public class lowerLevel
{
    Person explorer;
    int xLoc,yLoc;

    public lowerLevel(int x, int y)
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
        System.out.println("The treasure is nearby. However, there is an obstacle blocking it. Confront the obstacle.");
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
