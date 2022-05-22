package pjwstk;

import org.w3c.dom.ls.LSOutput;

public class Vehicle {
 // zqdanie 2.11
    int passengers;
    double fuelCap;
    double fuelConsumption;


public Vehicle(int passengers, int fuelCap, int fuelConsumption){
    this.passengers = passengers;
    this.fuelCap = fuelCap;
    this.fuelConsumption = fuelConsumption;
}


public double dataProcessing(){
        return this.fuelCap / this.fuelConsumption * 100;
    }
//    public void dataProccesingMiniVan(){
//        passengers = 7;
//        fuelCap = 70;
//        fuelConsumption = 9;
//
//        int range = fuelCap / fuelConsumption * 100;
//        System.out.println("minivan przewozi " + passengers +
//                 " na odległość do " + range + " kilometrów.");
//
//    }
//
//    public void dataProccesingSportsCar(){
//        passengers = 2;
//        fuelCap = 40;
//        fuelConsumption = 15;
//
//        int range = fuelCap / fuelConsumption * 100;
//        System.out.println("Auto sportowe przewozi " + passengers +
//                " na odległość do " + range + " kilometrów.");
//
//    }




    }


