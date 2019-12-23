package main.java.beans;

public abstract class Robot {

    public enum Direction {NORTH, EAST, SOUTH, WEST}


    protected Direction direction;
    protected int x;
    protected int y;

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void move() ;

    public abstract void left() ;

    public abstract void right() ;

    public abstract void place(int nx,int ny,Direction ndir);

    public abstract void report();
}