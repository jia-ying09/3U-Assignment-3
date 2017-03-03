
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
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);


        while (true) {
            timmy.move();

            //making timmy pick up all the things in a row
            if (timmy.canPickThing() == true) {
                timmy.pickAllThings();
                timmy.turnLeft();
            }

            //making timmy place items down on street 1
            int counter = 0;
            while (counter < 5) {
                counter = counter + 1;
                if (timmy.getStreet() == 1) {
                    timmy.putThing();
                    timmy.move();
                }

                //when timmy has nothing in his backpack he will return to 1,1
                if (timmy.countThingsInBackpack() == 0) {
                    timmy.turnAround();
                    timmy.move();
                    timmy.move();
                    timmy.move();
                    timmy.move();
                    timmy.move();
                    timmy.turnLeft();
                    timmy.move();
                }

                //making timmy pick up all the things in a row
                if (timmy.canPickThing() == true) {
                    timmy.pickAllThings();
                    timmy.turnLeft();
                }

                //making timmy place items down on street 2
                int t = 0;
                while (t < 3) {
                    t = t + 1;
                    if (timmy.getStreet() == 2) {
                        timmy.putThing();
                        timmy.move();
                    }
                    //when timmy has nothing in his backpack he will return to 2,1
                    if (timmy.countThingsInBackpack() == 0) {
                        timmy.turnAround();
                        timmy.move();
                        timmy.move();
                        timmy.move();
                        timmy.turnLeft();
                        timmy.move();
                    }

                    //making timmy pick up all the things in a row
                    if (timmy.canPickThing() == true) {
                        timmy.pickAllThings();
                        timmy.turnLeft();
                    }

                    //making timmy place items down on street 3
                    int th = 0;
                    while (th < 4) {
                        th = th + 1;
                        if (timmy.getStreet() == 3) {
                            timmy.putThing();
                            timmy.move();
                        }
                        //when timmy has nothing in his backpack he will return to 3,1
                        if (timmy.countThingsInBackpack() == 0) {
                            timmy.turnAround();
                            timmy.move();
                            timmy.move();
                            timmy.move();
                            timmy.move();
                            timmy.turnLeft();
                            timmy.move();
                        }
                    }
                }
            }
            //stopping at (4, 1)
        if (timmy.getStreet() == 4 && timmy.getAvenue() == 1) {
            break;
        }
        }
    }
}
        
        

    
