package pjwstk;

public class TestCircle {
    public static void main(String[] args) {

        // tworze 2 obiekty poprzez rozne konstruktory

        Circle c1 = new Circle();
        Circle c2 = new Circle(15);
        Circle c3 = new Circle(33 , "czerwony");
        Circle c4 = new Circle();
        c4.setColour("zielony");
        c4.setRadius(44);

        System.out.println( "Obiekt nr 1: pole = " + c1.getArea() + " promien = " + c1.getRadius());
        System.out.println(c1);
        System.out.println( "Obiekt nr 2: pole = " + c2.getArea() + " promien = " + c2.getRadius());
        System.out.println(c2);
        System.out.println( "Obiekt nr 3: pole = " + c3.getArea() + " promien = " + c3.getRadius());
        System.out.println(c3);
        System.out.println( "Obiekt nr 4: pole = " + c4.getArea() + " promien = " + c4.getRadius() + " kolor: " + c4.getColour());
        System.out.println(c4);

    }
}
