package Laboratorium6.zad_64;

import Laboratorium6.zad_62.Hash;

import java.util.HashMap;
import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap < Number , String> months = new HashMap <>();
        months.put(1,"January");
        months.put(2,"February");
        months.put(3, "March");
        months.put(4,"April");
        months.put(5,"May");
        months.put(6,"June");
        months.put(7,"July");
        months.put(8,"August");
        months.put(9, "September");
        months.put(10,"October");
        months.put(11,"November");
        months.put(12, "December");


        System.out.println("enter number from 1 to 12: ");
//        int number = scanner.nextInt();

       for (int i = 0 ; ; i++){
           int number = scanner.nextInt();
           if(number < 1 || number > 12){
               System.out.println("chose number from 1 to 12");

           }else{
               System.out.println("you chose: " + number);
               System.out.println("which month has a number " + number);
               System.out.println(months.get(number));
               break;
           }
       }

//        if(number < 1 || number > 12){
//            System.out.println("chose number from 1 to 12");
//        }else{
//            System.out.println("you chose: " + number);
//            System.out.println("which month has a number " + number);
//            System.out.println(months.get(number));
//        }



    }
}
