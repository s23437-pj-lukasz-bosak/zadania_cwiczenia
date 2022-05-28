package cars;

public class Ford extends Car implements Purchase{

    int year;
    int manufafacturerDiscount;



    Ford(int speed , double regularPrice, String colour , int year ,int manufafacturerDiscount ){
        super.speed = speed;
        super.regularPrice = regularPrice;
        super.colour = colour;
        this.manufafacturerDiscount = manufafacturerDiscount;
        this.year = year;
    }

    public String getPurchaseInfo(){
        return "FORD";
    }

    public double getSalePrice(){
        return super.regularPrice - manufafacturerDiscount;
    }
}
