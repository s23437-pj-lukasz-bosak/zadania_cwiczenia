package pjwstk;

public class Circle {
    // zmienne

    private double radius;
    private String colour;

    // konstruktory

    public Circle() {
        this.radius = 1;
        this.colour = "default";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.colour = "default";
    }

    public Circle(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }

    // metody

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
    public String getColour() {
        return this.colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString(){
        return this.radius + " " + this.colour;
    }
}
