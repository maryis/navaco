package main.java.beans;

public class NavacoRobot extends Robot {

    public Robot.Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move() {

        switch (direction) {
            case EAST:
                if (x < 4)
                    x++;
                else
                    System.out.println("not able to move in current direction");
                return;
            case WEST:
                if (x > 0)
                    x--;
                else
                    System.out.println("not able to move in current direction");
                return;

            case NORTH:
                if (y < 4)
                    y++;
                else
                    System.out.println("not able to move in current direction");
                return;

            case SOUTH:
                if (y > 0)
                    y--;
                else
                    System.out.println("not able to move in current direction");
                return;

        }
    }

    public void left() {

        if (direction.ordinal() != 0)
            direction = Robot.Direction.values()[(direction.ordinal() - 1)];
        else
            direction = Robot.Direction.values()[3];
        return;
    }

    public void right() {

        if (direction.ordinal() != 3)
            direction = Robot.Direction.values()[(direction.ordinal() +1)];
        else
            direction = Robot.Direction.values()[0];
        return;
    }

    public void place(int nx, int ny, Robot.Direction ndir){
        x=nx;
        y=ny;
        direction=ndir;
    }

    public void report(){
        System.out.printf("\nx: %d  , y: %d , Dir: %s",x,y,direction.toString());
    }
}
