package pjwstk;

public class Circle {

   private double radius = 0.1;
   private String colour = "blue";

    Circle(){

    }

    Circle(double radius){
       radius = this.radius;

    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return getRadius()*getRadius()*3.14;
    }


}
