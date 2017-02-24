
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // city kw
        City kw = new City();
        //robot karel
        RobotSE timmy = new RobotSE(kw, 1, 1, Direction.EAST);
        //creating enclosed rectangular room
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        //inserting litter
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 4);
        new Thing(kw, 3, 1);
        
        //making timmy pick up litter
        //loop
        
            
       while (true){ timmy.pickAllThings(); 
       if (timmy.getAvenue() == 4){
           timmy.turnRight();
       }
        if (timmy.getAvenue() == 1){
           timmy.turnLeft();
       }
        if(timmy.frontIsClear() == true)
            timmy.move();

       }
        
        //making timmy move to 1,1 if avenue is less than 1
      
}
           