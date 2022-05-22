package pjwstk;

public class Vehiclez {
//zadanie 2,12
   private int passengers = 0;
   private double fuelCap = 0;
   private double fuelConsumption = 0;
    java.text.DecimalFormat df=new java.text.DecimalFormat("0.00");
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

    Vehiclez (double fuelCap , int passengers , double fuelConsumption){
        setFuelCap(fuelCap);
        setPassengers(passengers);
        setFuelConsumption(fuelConsumption);
    }

    public void range(){
        double r = getFuelCap() / getFuelConsumption() * 100;
        System.out.println("zasieg (km): " + df.format(r));

    }


    // STARE >>>
//    public double range(){
//        return getFuelCap() / getFuelConsumption() *100;
//    }


    // Stare
//    public void rangeMiniVan(){
//        setFuelCap(79);
//        setFuelConsumption(9);
//        setPassengers(7);
//        int r = getFuelCap() / getFuelConsumption() * 100;
//        System.out.println("mini Van przewozi " + getPassengers() + " Osób.");
//        System.out.println("zasieg (km): " + r);
//
//    }
//
//    public void rangeSportCar(){
//        setFuelCap(50);
//        setFuelConsumption(14);
//        setPassengers(2);
//        int r = getFuelCap() / getFuelConsumption() * 100;
//        System.out.println("Auto sportowe przewozi " + getPassengers() + " Osób.");
//        System.out.println("zasieg (km): " + r);
//
//
//    }
}
