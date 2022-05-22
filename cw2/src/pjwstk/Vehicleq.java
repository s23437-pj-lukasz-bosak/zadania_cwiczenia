package pjwstk;

public class Vehicleq {
    int passengers;
    double fuelCap;
    double fuelConsumption;

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

    Vehicleq(double fuelCap, int passengers, double fuelConsumption) {
        setFuelCap(fuelCap);
        setPassengers(passengers);
        setFuelConsumption(fuelConsumption);
    }

    public double range() {
        return getFuelCap() / getFuelConsumption() * 100;
    }

    public double fuel(int distance) {
        return (distance * this.fuelConsumption) / 100;

    }
}
