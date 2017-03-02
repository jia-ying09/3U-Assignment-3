
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();

        //create robot timmy
        RobotSE timmy = new RobotSE(kw, 3, 3, Direction.SOUTH);

        //create box (top left)
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.EAST);

        //create box (top right)
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 1, 5, Direction.EAST);

        //create box (bottom left)
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.EAST);

        //create box (bottom right)
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 5, 4, Direction.WEST);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);

        //setting a counter
        int counter = 0;
        while (counter < 8) {
            counter = counter + 1;

            //making timmy move around the block
            if (timmy.frontIsClear() == true) {
                timmy.move();
                timmy.move();
                timmy.move();
                timmy.turnLeft();
                timmy.move();
                timmy.move();
                timmy.move();
                timmy.turnLeft();
            }
            if (timmy.getStreet() == 3 && timmy.getAvenue() == 3) {
                timmy.turnRight();
            }

        }
    }
}
