package Lab5.zad5_2;

public class MovablePoint {

    private int x;
    private int y;

    public MovablePoint(int x , int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x = " + x + " y = " + y;
    }

    public void moveUp(int distance){
        this.y += distance;
    }

    public void moveDown(int distance){
        this.y -= distance;
    }

    public void moveLeft( int distance){
        this.x -= distance;
    }

    public void moveRight(int distance){
        this.x += distance;
    }


}
