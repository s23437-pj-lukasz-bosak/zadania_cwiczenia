package Lab5.zad5_2;

public class TestMovable {
    public static void main(String[] args) {

        MovablePoint mov1 = new MovablePoint(0, 0);
        mov1.moveUp();
        System.out.println(mov1);
        mov1.moveUp();
        System.out.println(mov1);
        mov1.moveLeft();
        System.out.println(mov1);
        mov1.moveLeft();
        System.out.println(mov1);
        mov1.moveDown();
        System.out.println(mov1);
        mov1.moveDown();
        System.out.println(mov1);
        mov1.moveRight();
        System.out.println(mov1);
        mov1.moveRight();
        System.out.println(mov1);

        // zaczynam w punkcie 0:0 i koncze w punkcie 0:0
    }
}
