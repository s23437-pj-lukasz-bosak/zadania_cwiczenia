package cars;

public class Truck extends Car implements Purchase{

    int weight;

    Truck(int speed , double regularPrice, String colour , int weight ) {
       super.speed = speed;
       super.regularPrice = regularPrice;
       super.colour = colour;
       this.weight = weight;
    }

    public double getSalePrice(){
        if(weight > 2000){
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        }else{
            return super.getSalePrice();
        }
    }
    public String getPurchaseInfo(){
        return "TRUCK";
    }

}
