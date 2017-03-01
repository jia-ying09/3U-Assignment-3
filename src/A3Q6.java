
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new city kw
        City kw = new City();
        //robot timmy
        RobotSE timmy = new RobotSE(kw, 0, 1, Direction.SOUTH);
        //show number of things in a pile
        kw.showThingCounts(true);
        //placing things in a row
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);

        //making timmy pick up all the things
        while (true) {
            timmy.move();
            if (timmy.canPickThing() == true) {
                timmy.pickAllThings();
            }
            if (timmy.getStreet() == 4) {
                timmy.putThing();
                timmy.turnLeft();
                timmy.move();
                timmy.putThing();
                timmy.turnLeft();
                timmy.move();
            }
            if (timmy.getStreet() == 0) {
                timmy.putThing();
                timmy.turnRight();
                timmy.move();
                timmy.putThing();
                timmy.turnRight();
                timmy.move();
            }
            
            if (timmy.frontIsClear() == true) {
                timmy.putThing();
            }
            if (timmy.countThingsInBackpack() == 0) {
                timmy.move();
                break;
            }

        }


    }
}
