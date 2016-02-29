
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahmf8586
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE jill = new RobotSE(kw, 4, 8, Direction.SOUTH);
        
        while (!jill.isFacingNorth()) {
            jill.turnLeft();
        }
        while (jill.getStreet()>0) {
            jill.move();
        }
        jill.turnLeft();
        while (jill.getAvenue()>0) {
            jill.move();
        }
    }
}
