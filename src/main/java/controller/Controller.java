package main.java.controller;

import main.java.beans.NavacoRobot;
import main.java.beans.Robot;

public class Controller {
    public static void main(String[] args) {


        Robot robot=new NavacoRobot();
        robot.place(0,0, Robot.Direction.NORTH);
        robot.move();
        robot.report();
        robot.left();
        robot.report();

    }
}
