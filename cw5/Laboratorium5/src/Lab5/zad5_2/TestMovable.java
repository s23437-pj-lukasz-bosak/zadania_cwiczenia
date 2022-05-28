package Lab5.zad5_2;

public class TestMovable {
    public static void main(String[] args) {

        MovablePoint mov1 = new MovablePoint(0, 0);
        mov1.moveUp(5);
        System.out.println(mov1);
        mov1.moveUp(2);
        System.out.println(mov1);
        mov1.moveLeft(15);
        System.out.println(mov1);
        mov1.moveLeft(5);
        System.out.println(mov1);
        mov1.moveDown(7);
        System.out.println(mov1);
        mov1.moveRight(20);
        System.out.println(mov1);

        // zaczynam w punkcie 0:0 i koncze w punkcie 0:0
    }
}
