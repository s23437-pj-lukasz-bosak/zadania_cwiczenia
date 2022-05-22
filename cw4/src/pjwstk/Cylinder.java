package pjwstk;

public class Cylinder extends Circle{

    private double height = 4.0;

    Cylinder(){

    }

    Cylinder(double radius){
        super.radius = radius;
    }


    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return super.getArea()* getHeight() + super.radius;
    }
}
