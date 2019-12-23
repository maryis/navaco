package test.java;


import main.java.beans.NavacoRobot;
import main.java.beans.Robot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testRobot {

    Robot robot;

    @Before
    public void inti(){
        robot=new NavacoRobot();
        robot.place(0,0, Robot.Direction.NORTH);
    }

    @Test
    public void testMove(){

        robot.move();
        Assert.assertSame(1,robot.getY());
        Assert.assertSame(0,robot.getX());

        robot.place(0,0, Robot.Direction.SOUTH);

        robot.move();
        Assert.assertSame(0,robot.getY());
        Assert.assertSame(0,robot.getX());

    }

    @Test
    public void testSpin(){

        robot.left();
        Assert.assertSame(Robot.Direction.WEST,robot.getDirection());


        robot.left();
        Assert.assertSame(Robot.Direction.SOUTH,robot.getDirection());

        robot.right();
        Assert.assertSame(Robot.Direction.WEST,robot.getDirection());


    }
}
