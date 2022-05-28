package pjwstk;

public class Circle {

  public double radius = 0.1;
  public String colour = "blue";
    java.text.DecimalFormat df=new java.text.DecimalFormat("0.000");
    Circle(){

    }

    Circle(double radius){
       this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return getRadius() * getRadius() * 3.14;
    }

    @Override
    public String toString(){
        return "radius = " + getRadius() + " Area = "
                + df.format(getArea()) + " colour = " + colour;
    }
}
