package cars;

public class AutoShop {

    public static void main(String[] args) {

        Sedan sedan1 = new Sedan(160 , 20000 , "red" , 10);
        System.out.println(sedan1.getPurchaseInfo() + ": " + sedan1.getSalePrice() );

        Ford ford1 = new Ford(156,4452.0 , "black" , 2005 , 10 );
        System.out.println(ford1.getPurchaseInfo() + ": " + ford1.getSalePrice() );

        Ford ford2 = new Ford (155, 5000.0 , "pink" , 1998 , 5 );
        System.out.println(ford2.getPurchaseInfo() + ": " + ford2.getSalePrice() );

        Truck truck1 = new Truck(200, 500000, "gold" , 5000);
        System.out.println(truck1.getPurchaseInfo() + ": " + truck1.getSalePrice() );


    }


}
