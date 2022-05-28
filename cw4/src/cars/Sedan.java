package cars;
// podrzedna klasa sedan podpunkt B

public class Sedan extends Car implements Purchase {

    int lenght;

    Sedan(int speed , double regularPrice, String colour , int lenght ){
        super.speed = speed;
        super.regularPrice = regularPrice;
        super.colour = colour;
        this.lenght = lenght;
    }


    public double getSalePrice(){
        if (this.lenght > 20){
           return super.getSalePrice() - (0.05 * super.getSalePrice());
        }else{
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        }
    }
    public String getPurchaseInfo(){
        return "SEDAN";
    }
}
