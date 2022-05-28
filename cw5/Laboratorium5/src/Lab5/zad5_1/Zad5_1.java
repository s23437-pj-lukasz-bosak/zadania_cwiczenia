package Lab5.zad5_1;

import java.util.ArrayList;

public class Zad5_1 {
    public static void main(String[] args) {

        ArrayList <Integer> evenList = new ArrayList <Integer>();
// pomiar czasu start
        long time1 = System.currentTimeMillis() , time2;
// ta pętla tworzy liste i wprowadza do niej liczby pierwsze.
        for(int i = 0; i < 100 ; i++){
            if(i%2 == 0 ){
                evenList.add(i);
            }
//            System.out.println("nr indexu: " + i + " liczba: " + even.get(i));  // czemu nie dziala???
            // chchialem zredukowac do jednej pętli
        }

// pętla wypisujaca na ekran
        for (int i = 0 ; i < evenList.size() ; i++){
            System.out.println("nr indexu: " + i + " liczba: " + evenList.get(i));
        }
// koniec mierzenia czasu
        time2 = System.currentTimeMillis();


        System.out.println("Czas operacji ms: " + (time2 - time1));
    }


    }






