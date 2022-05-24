package pjwstk;

public class Ford extends Car{

    int year;
    int manufafacturerDiscount;

    Ford(int speed , double regularPrice, String colour , int year ,int manufafacturerDiscount ){
        speed = super.speed;
        regularPrice = super.regularPrice;
        colour = super.colour;
        manufafacturerDiscount = this.manufafacturerDiscount;
        year = this.year;
    }

    public double getSalePrice(){
        return super.regularPrice - manufafacturerDiscount;
    }
}
