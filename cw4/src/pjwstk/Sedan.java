package pjwstk;
// podrzedna klasa sedan podpunkt B

public class Sedan extends Car {

    int lenght;

    Sedan(int speed , double regularPrice, String colour , int lenght ){
        speed = super.speed;
        regularPrice = super.regularPrice;
        colour = super.colour;
        lenght = this.lenght;
    }


    public double getSalePrice(){
        if (this.lenght > 20){
           return super.getSalePrice() - (0.05 * super.getSalePrice());
        }else{
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        }
    }
}
