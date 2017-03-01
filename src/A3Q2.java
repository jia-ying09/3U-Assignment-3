
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new city
        City kw = new City();
        //create karel
        Robot karel = new Robot(kw, 0, 2, Direction.WEST);
        
        //create the box
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        //making karel move around the box
        int counter = 0;
        while (counter < 2){
        while (true) {
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();
        counter = counter + 1;}


           
           
        }
            
    }
}

