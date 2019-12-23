package main.java.beans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {

    private Robot robot;

    public static Player getPlayer(Robot robot){
        return new Player(robot);
    }

    private Player(Robot robot) {
        this.robot = robot;
    }

    public void start() {

        robot.place(0,0, Robot.Direction.NORTH);
        System.out.println("The Robot is in 0,0,North");
        while (true) {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));

            nextMove(reader);
            System.out.println("\nDo you want to continue?(y/n)");

            String cont = null;
            try {
                cont = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (!cont.equals("y"))
                break;

            nextMove(reader);
        }

    }

    public void nextMove(BufferedReader r) {

        System.out.println("Select next action from list:");
        System.out.println("1: set place");
        System.out.println("2: move to selected direction");
        System.out.println("3: spin direction 90 degree to left");
        System.out.println("4: spin direction 90 degree to right");
        System.out.println("5: report current status");

        String action = null;
        try {
            action = r.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (action) {
            case "1": //place
                System.out.println("Select next x(0..5)");
                int x = 0;
                try {

                    x = r.read();
                    System.out.println("Select next y(0..5)");
                    int y = r.read();
                    System.out.println("Select next dir(0:NORTH, 1:EAST, 2:SOUTH, 3:WEST)");
                    int dir = r.read();
                    robot.place(x, y, Robot.Direction.values()[dir]);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            case "2"://move

                robot.move();
                break;

            case "3"://left
                robot.left();
                break;
            case "4"://right

                robot.right();
                break;
            case "5"://report

                robot.report();
                break;
        }
    }
}
