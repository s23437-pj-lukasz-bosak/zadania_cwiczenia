package pjwstk;
//zadanie 2.13
public class Vehicley {
   private int passengers;
   private double fuelCap;
   private double fuelConsumption;

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(double fuelCap) {
        this.fuelCap = fuelCap;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    Vehicley (double fuelCap , int passengers , double fuelConsumption){
        setFuelCap(fuelCap);
        setPassengers(passengers);
        setFuelConsumption(fuelConsumption);
    }

    public double range(){
        return getFuelCap() / getFuelConsumption() *100;
    }



    // STAREE
//    public int rangeMiniVan(){
//        setFuelCap(79);
//        setFuelConsumption(9);
//        setPassengers(7);
//        int r = getFuelCap() / getFuelConsumption() * 100;
//
//        return r;
//
//    }
//
//    public int rangeSportCar(){
//        setFuelCap(50);
//        setFuelConsumption(14);
//        setPassengers(2);
//        int r = getFuelCap() / getFuelConsumption() * 100;
//        return r;
//
//
//    }
}
