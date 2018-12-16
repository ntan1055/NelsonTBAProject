package Game;

import People.Person;
import Rooms.Door;
import Rooms.Exit;
import Rooms.Ladder;
import Rooms.Room;
import Rooms.lowerLevel;
import Rooms.exitLevel;

import java.util.Scanner;

public class Runner {
	

	private static boolean gameOn = true;

	public static void main(String[] args)
	{
		Room[][] cave = new Room[5][5];
		
		//Fill the building with normal rooms
		for (int x = 0; x<cave.length; x++)
		{
			for (int y = 0; y < cave[x].length; y++)
			{
				cave[x][y] = new Room(x,y);
			}
		}
		
		//Create a random ladder.
		int x = (int)(Math.random()*cave.length);
		int y = (int)(Math.random()*cave.length);
		cave[x][y] = new Ladder(x, y);
		 
		 //Setup player 1 and the input scanner
		Person player1 = new Person("FirstName", "FamilyName", 0,0);
		cave[0][0].enterCave(player1);
		Scanner in = new Scanner(System.in);
		while(gameOn)
		{
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			if(validMove(move, player1, cave))
			{
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}
			else {
				System.out.println("Please choose a valid move.");
			}
		}
		in.close();
	}

	/**
	 * Checks that the movement chosen is within the valid game map.
	 * @param move the move chosen
	 * @param p person moving
	 * @param map the 2D array of rooms
	 * @return
	 */
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "n":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveCave(p);
					map[p.getxLoc()-1][p.getyLoc()].enterCave(p);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveCave(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterCave(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveCave(p);
					map[p.getxLoc()+1][p.getyLoc()].enterCave(p);
					return true;
				}
				else
				{
					return false;
				}

			case "w":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveCave(p);
					map[p.getxLoc()][p.getyLoc()-1].enterCave(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
    public static boolean validMove(String move, Person p, lowerLevel[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveCave(p);
                    map[p.getxLoc()-1][p.getyLoc()].enterCave(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "e":
                if (p.getyLoc()< map[p.getyLoc()].length -1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveCave(p);
                    map[p.getxLoc()][p.getyLoc() + 1].enterCave(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getxLoc() < map.length - 1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveCave(p);
                    map[p.getxLoc()+1][p.getyLoc()].enterCave(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (p.getyLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveCave(p);
                    map[p.getxLoc()][p.getyLoc()-1].enterCave(p);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }

    public static boolean validMove(String move, Person p, exitLevel[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveCave(p);
                    map[p.getxLoc()-1][p.getyLoc()].enterCave(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "e":
                if (p.getyLoc()< map[p.getyLoc()].length -1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveCave(p);
                    map[p.getxLoc()][p.getyLoc() + 1].enterCave(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getxLoc() < map.length - 1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveCave(p);
                    map[p.getxLoc()+1][p.getyLoc()].enterCave(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (p.getyLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveCave(p);
                    map[p.getxLoc()][p.getyLoc()-1].enterCave(p);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }

    //Switch Room to LowerLevel
	public static void switchRoom()
	{
	    Person player2 = new Person("FirstName", "FamilyName", 0,0);
	    Scanner in = new Scanner(System.in);
	    while(gameOn)
	    {
	        lowerLevel[][] lowerLevel = new lowerLevel[5][5];
	        for (int x = 0; x<lowerLevel.length; x++)
	        {
	            for (int y = 0; y < lowerLevel[x].length; y++)
	            {
	                lowerLevel[x][y] = new lowerLevel(x,y);
	            }
	        }
            int x = (int)(Math.random()*lowerLevel.length);
            int y = (int)(Math.random()*lowerLevel.length);
            lowerLevel[x][y] = new Door(x, y);
	        System.out.println("Where would you like to move? (Choose N, S, E, W)");
	        String move = in.nextLine();
	        if(validMove(move, player2, lowerLevel))
	        {
	            System.out.println("Your coordinates: row = " + player2.getxLoc() + " col = " + player2.getyLoc());
	        }
	        else
	            {
	            System.out.println("Please choose a valid move.");
                }
            }
            in.close();
	}
	//Go up from LowerLevel to Room
	public static void goUp()
    {
        Person player3 = new Person("FirstName", "FamilyName", 4,4);
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            exitLevel[][] caveExit = new exitLevel[5][5];
            for (int x = 0; x<caveExit.length; x++)
            {
                for (int y = 0; y < caveExit[x].length; y++)
                {
                    caveExit[x][y] = new exitLevel(x,y);
                }
            }
            caveExit[0][0] = new Exit(0, 0);
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, player3, caveExit))
            {
                System.out.println("Your coordinates: row = " + player3.getxLoc() + " col = " + player3.getyLoc());
            }
            else
            {
                System.out.println("Please choose a valid move.");
            }
        }
        in.close();
    }

    public static void gameOff()
	{
		gameOn = false;
	}
}
