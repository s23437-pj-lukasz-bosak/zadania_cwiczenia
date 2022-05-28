package pjwstk;

public class Cylinder extends Circle{

    private double height = 4.0;

    Cylinder(){

    }

    Cylinder(double radius){
        super(radius);
    }

    Cylinder(double radius, double height){
        super(radius);
        this.height = height;

    }


    public double getHeight() {
        return this.height;
    }

    public double getVolume(){
        return getArea()* getHeight() * getRadius();
    }
}
