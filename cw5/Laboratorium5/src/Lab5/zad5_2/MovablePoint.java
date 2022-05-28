package Lab5.zad5_2;


public class MovablePoint implements Movable {

    private int x;
    private int y;

    public MovablePoint(int x , int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x = " + x + " y = " + y;
    }

    public void moveUp(){
        this.y ++;
    }

    public void moveDown(){
        this.y --;
    }

    public void moveLeft(){
        this.x --;
    }

    public void moveRight(){
        this.x ++;
    }


}
