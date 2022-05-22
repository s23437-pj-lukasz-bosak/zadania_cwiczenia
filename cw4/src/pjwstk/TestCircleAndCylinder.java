package pjwstk;

public class TestCircleAndCylinder {
    public static void main(String[] args) {
        java.text.DecimalFormat df=new java.text.DecimalFormat("0.000");
        // konstruktor bezargumentowy
        Circle c1 = new Circle();
        Cylinder cy1 = new Cylinder();

        // konstruktor z argumentem
        Circle c2 = new Circle(5.0);
        Cylinder cy2 = new Cylinder(6.2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(cy1);
        System.out.println(cy2);

        System.out.println("cylinder: volume = " + df.format(cy1.getVolume())
                + " wysokosc = " + cy1.getHeight()
                + " promien = " + cy1.getRadius() + " kolor : " + cy1.colour);

        System.out.println("cylinder: volume = " + df.format(cy2.getVolume())
                + " wysokosc = " + cy2.getHeight()
                + " promien = " + cy2.getRadius() + " kolor : " + cy2.colour );




    }




}
