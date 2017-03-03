
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();

        //robot karel
        Robot karel = new Robot(kw, 0, 0, Direction.EAST);

        // inserting thing and wall
        new Thing(kw, 0, 2);
        new Thing(kw, 0, 3);
        new Wall(kw, 0, 4, Direction.WEST);

        //robot timmy
        Robot timmy = new Robot(kw, 2, 0, Direction.EAST);

        //inserting wall and thing
        new Wall(kw, 2, 5, Direction.EAST);
        new Thing(kw, 2, 6);

        //making karel move
        while (true) {
            karel.move();

            //making karel stop at first thing
            if (karel.canPickThing()) {
                break;
            }

            //making timmy move
            while (true) {
                timmy.move();

                //making timmy stop at first wall
                if (timmy.frontIsClear() == false) {
                    break;
                }
            }
        }
    }
}
