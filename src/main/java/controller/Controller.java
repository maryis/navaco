package main.java.controller;

import main.java.beans.NavacoRobot;
import main.java.beans.Player;
import main.java.beans.Robot;

public class Controller {
    public static void main(String[] args) {


        Robot robot=new NavacoRobot();
        Player player=Player.getPlayer(robot);
        player.start();
    }
}
