package Laboratorium5.Zad511;

import java.util.ArrayList;

public class Zad51 {
    public static void main(String[] args) {

        ArrayList<Integer> even = new ArrayList<Integer>();

        long time1 = System.currentTimeMillis() , time2;

        for(int i = 0; i < 100 ; i++){
            if(i%2 == 0 ){
                even.add(i);
               }
//            System.out.println("nr indexu: " + i + " liczba: " + even.get(i));  // czemu nie dziala???
        }
        for (int i = 0 ; i < even.size() ; i++){
            System.out.println("nr indexu: " + i + " liczba: " + even.get(i));
        }

        time2 = System.currentTimeMillis();


        System.out.println("Czas operacji ms: " + (time2 - time1));
    }

}
