
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city kw
        City kw = new City();
        //create rectangular box
        new Wall(kw, 3, 0, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 0, 0, Direction.NORTH);
        new Wall(kw, 0, 1, Direction.NORTH);
        new Wall(kw, 0, 2, Direction.NORTH);
        new Wall(kw, 0, 3, Direction.NORTH);
        new Wall(kw, 0, 4, Direction.NORTH);
        new Wall(kw, 0, 5, Direction.NORTH);
        new Wall(kw, 0, 5, Direction.EAST);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 5, Direction.EAST);
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.WEST);
        //create robot karel
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.WEST);
        //making karel find the exit
        while (true) {
            if (karel.frontIsClear() == true) {
                karel.turnRight();
                karel.move();
            } else if (karel.frontIsClear() == false) {
                karel.turnRight();
            }
            if (karel.isFacingSouth() == true) {
                if (karel.frontIsClear() == true)
                    karel.move(); 
        }       if(karel.getStreet() == 4)
            break;
        else if(karel.getAvenue() == 6)
            break;


    }
}
}
