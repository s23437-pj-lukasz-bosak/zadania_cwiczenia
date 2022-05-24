package cars;

public class Truck extends Car{

    int weight;
    int testtest;
    Truck(int speed , double regularPrice, String colour , int weight ) {
        speed = super.speed;
        regularPrice = super.regularPrice;
        colour = super.colour;
        weight = this.weight;
    }

    public double getSalePrice(){
        if(weight > 2000){
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        }else{
            return super.getSalePrice();
        }
    }

}
