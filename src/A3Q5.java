
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
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating city kw
        City kw = new City();

        //creating robot timmy
        RobotSE timmy = new RobotSE(kw, 1, 1, Direction.EAST);

        //show the number of things there are
        kw.showThingCounts(true);

        //inserting a pile of 10 things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);

        //creating counter
        int counter = 0;
        while (counter < 9) {
            counter = counter + 1;

            //making timmy move a pile of things to a new spot
            if (timmy.canPickThing() == true) {
                timmy.pickThing();
                timmy.move();
                timmy.turnAround();
                timmy.putThing();
                timmy.move();
                timmy.turnAround();
            }
        }
        if (timmy.canPickThing() == true) {
            timmy.pickThing();
        }
        timmy.move();
        timmy.putThing();
    }
}
