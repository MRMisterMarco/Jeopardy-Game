
/**
 * Write a description of class GameBoardGraphics here.
 *
 * @author (Marco Rosales)
 * @version (11/18/17)
 */
import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.world.World;
import info.gridworld.grid.Location;
import java.awt.Color;
import info.gridworld.actor.Bug;
import java.util.ArrayList;
import info.gridworld.actor.ActorWorld;
public class GameBoardGraphics
{
    
    
    
    // instance variables that displays picture of buzzer that can move to a location
    public static Buzzer pointsAt = new Buzzer(0);
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(6,7), pointsAt);
        pointsAt.setColor(Color.red);
        
        //Getting the actor to move by pressing keys
        java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager()
        .addKeyEventDispatcher(new java.awt.KeyEventDispatcher()
        {
                public boolean dispatchKeyEvent(java.awt.event.KeyEvent event)
                {
                    String key = javax.swing.KeyStroke.getKeyStrokeForEvent(event).toString();
                    if (key.equals("pressed UP"))
                    {
                        pointsAt.setDirection(0);
                    }
                    if (key.equals("pressed RIGHT"))
                    {
                        pointsAt.setDirection(90);
                    }
                    if (key.equals("pressed DOWN"))
                    {
                        pointsAt.setDirection(180);
                    }
                    if (key.equals("pressed LEFT"))
                    {
                        pointsAt.setDirection(270);
                    }
                    return true;
                }
            });
        //setMessage("Welcome to Jeopardy!");
        //setMessage("");
        //******************************************************************
        //Dollar signs
        moneySign sideRow = new moneySign(1);
        world.add(new Location(1, 0), sideRow);
        
        moneySign sideRow1 = new moneySign(1);
        world.add(new Location(2, 0), sideRow1);
        
        moneySign sideRow2 = new moneySign(1);
        world.add(new Location(3, 0), sideRow2);
        
        moneySign sideRow3 = new moneySign(1);
        world.add(new Location(4, 0), sideRow3);
        
        moneySign sideRow4 = new moneySign(1);
        world.add(new Location(5, 0), sideRow4);
        
        moneySign rowThree = new moneySign(1);
        world.add(new Location(1, 2), rowThree);
        
        moneySign rowThree1 = new moneySign(1);
        world.add(new Location(2, 2), rowThree1);
        
        moneySign rowThree2 = new moneySign(1);
        world.add(new Location(3, 2), rowThree2);
        
        moneySign rowThree3 = new moneySign(1);
        world.add(new Location(4, 2), rowThree3);
        
        moneySign rowThree4 = new moneySign(1);
        world.add(new Location(5, 2), rowThree4);
        
        moneySign rowFive = new moneySign(1);
        world.add(new Location(1, 4), rowFive);
        
        moneySign rowFive1 = new moneySign(1);
        world.add(new Location(2, 4), rowFive1);
        
        moneySign rowFive2 = new moneySign(1);
        world.add(new Location(3, 4), rowFive2);
        
        moneySign rowFive3 = new moneySign(1);
        world.add(new Location(4, 4), rowFive3);
        
        moneySign rowFive4 = new moneySign(1);
        world.add(new Location(5, 4), rowFive4);
        
        moneySign rowSeven = new moneySign(1);
        world.add(new Location(1, 6), rowSeven);
        
        moneySign rowSeven1 = new moneySign(1);
        world.add(new Location(2, 6), rowSeven1);
        
        moneySign rowSeven2 = new moneySign(1);
        world.add(new Location(3, 6), rowSeven2);
        
        moneySign rowSeven3 = new moneySign(1);
        world.add(new Location(4, 6), rowSeven3);
        
        moneySign rowSeven4 = new moneySign(1);
        world.add(new Location(5, 6), rowSeven4);
        
        moneySign rowNine = new moneySign(1);
        world.add(new Location (1, 8), rowNine);
        
        moneySign rowNine1 = new moneySign(1);
        world.add(new Location(2, 8), rowNine1);
        
        moneySign rowNine2 = new moneySign(1);
        world.add(new Location(3, 8), rowNine2);
        
        moneySign rowNine3 = new moneySign(1);
        world.add(new Location(4, 8), rowNine3);
        
        moneySign rowNine4 = new moneySign(1);
        world.add(new Location(5, 8), rowNine4);
        //*******************************************************************
        //*******************************************************************
        //200 sign
        score200 secondRow = new score200(1);
        world.add(new Location(1,1), secondRow);
        
        score200 secondRow1 = new score200(1);
        world.add(new Location(1,3), secondRow1);
        
        score200 secondRow2 = new score200(1);
        world.add(new Location(1,5), secondRow2);
        
        score200 secondRow3 = new score200(1);
        world.add(new Location(1,7), secondRow3);
        
        score200 secondRow4 = new score200(1);
        world.add(new Location(1,9), secondRow4);
        //*******************************************************************
        //*******************************************************************
        //400 sign
        score400 thirdRow = new score400(1);
        world.add(new Location(2, 1), thirdRow);
        
        score400 thirdRow1 = new score400(1);
        world.add(new Location(2, 3), thirdRow1);
        
        score400 thirdRow2 = new score400(1);
        world.add(new Location(2, 5), thirdRow2);
        
        score400 thirdRow3 = new score400(1);
        world.add(new Location(2, 7), thirdRow3);
        
        score400 thirdRow4 = new score400(1);
        world.add(new Location(2, 9), thirdRow4);
        //*******************************************************************
        //*******************************************************************
        //600 sign
        score600 fourthRow = new score600(1);
        world.add(new Location(3, 1),fourthRow);
        
        score600 fourthRow1 = new score600(1);
        world.add(new Location(3, 3),fourthRow1);
        
        score600 fourthRow2 = new score600(1);
        world.add(new Location(3, 5),fourthRow2);
        
        score600 fourthRow3 = new score600(1);
        world.add(new Location(3, 7),fourthRow3);
        
        score600 fourthRow4 = new score600(1);
        world.add(new Location(3, 9),fourthRow4);
        //*******************************************************************
        //*******************************************************************
        //800 sign
        score800 fifthRow = new score800(1);
        world.add(new Location(4, 1), fifthRow);
        
        score800 fifthRow1 = new score800(1);
        world.add(new Location(4, 3), fifthRow1);
        
        score800 fifthRow2 = new score800(1);
        world.add(new Location(4, 5), fifthRow2);
        
        score800 fifthRow3 = new score800(1);
        world.add(new Location(4, 7), fifthRow3);
        
        score800 fifthRow4 = new score800(1);
        world.add(new Location(4, 9), fifthRow4);
        //*******************************************************************
        //*******************************************************************
        //1000 sign
        score1000 sixthRow = new score1000(1);
        world.add(new Location(5, 1), sixthRow);
        
        score1000 sixthRow1 = new score1000(1);
        world.add(new Location(5, 3), sixthRow1);
        
        score1000 sixthRow2 = new score1000(1);
        world.add(new Location(5, 5), sixthRow2);
        
        score1000 sixthRow3 = new score1000(1);
        world.add(new Location(5, 7), sixthRow3);
        
        score1000 sixthRow4 = new score1000(1);
        world.add(new Location(5, 9), sixthRow4);
        //*******************************************************************
        //*******************************************************************
        superHeroes2 rowOne = new superHeroes2(1);
        world.add(new Location(0,1), rowOne);
        
        presidents2 rowOne1 = new presidents2(1);
        world.add(new Location(0,3), rowOne1);
        
        fourLW2 rowOne2 = new fourLW2(1);
        world.add(new Location(0,5), rowOne2);
        
        comedians2 rowOne3 = new comedians2(1);
        world.add(new Location(0,7), rowOne3);
        
        games rowOne4 = new games(1);
        world.add(new Location(0,9), rowOne4);
        //*******************************************************************
        //*******************************************************************/
        superHeroes1 zeroRow = new superHeroes1(1);
        world.add(new Location(0,0), zeroRow);
        
        presidents1 zeroRow1 = new presidents1(1);
        world.add(new Location(0,2), zeroRow1);
        
        fourLW1 zeroRow2 = new fourLW1(1);
        world.add(new Location(0,4), zeroRow2);
        
        comedians1 zeroRow3 = new comedians1(1);
        world.add(new Location(0,6), zeroRow3);
        
        classic zeroRow4 = new classic(1);
        world.add(new Location(0,8), zeroRow4);
        //*******************************************************************/
        //*******************************************************************
        //*******************************************************************
        //*******************************************************************
        //*******************************************************************
         world.show();
    }
}
