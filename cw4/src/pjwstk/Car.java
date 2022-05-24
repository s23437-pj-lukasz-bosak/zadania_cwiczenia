package pjwstk;

public class Car {
    // nadrzedna klasa car. podpunkt A

    int speed;
    double regularPrice;
    String colour;

// konstruktor

    Car(){
        // utworzylem konstruktor bezargumentowy bo wywal mi sie blad ze brak konstruktora domyslengo. dlaczego ?
    }

    Car(int speed, double regularPrice , String colour){
        speed = this.speed;
        regularPrice = this.regularPrice;
        colour = this.colour;
    }

    // metody
    public double getSalePrice(){
        return this.regularPrice;
    }
}
