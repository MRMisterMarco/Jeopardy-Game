
/**
 * Write a description of class Buzzer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
public class Buzzer extends Bug
{
    // instance variables - replace the example below with your own
    private int steps;
    private int sideLength;


    public Buzzer(int length)
    {
        sideLength = length;
        steps = 0;
    }


    public void act()
    {
        if (steps < sideLength) // && canMove())
        {
            //move();
            //steps++;
        }
        else
        {
            //turn();
            //turn();
            //steps = 0;
            
        }
    }
}
