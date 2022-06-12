package Lab5.zad5_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Coffe {

    public static void main(String[] args) {
     // A)
        ArrayList <String> coffes= new ArrayList<>();
     // B)
        coffes.add("espresso");
        coffes.add("latte");
        coffes.add("cappucino");
        coffes.add("mocha");
        coffes.add("auLait");
        coffes.add("macchiato");

        System.out.println(coffes);

     // C)
        // tworze iterator
        Iterator<String> iterator = coffes.iterator();

     // wypisuje wszystko kozystajac z pętli
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
     // D)

        for (String coffe : coffes ) {
            System.out.println(coffe.toUpperCase());
            }
        // E)

        for ( int i = 0 ; i < coffes.size() ; i ++){
            System.out.println(coffes.get(i).subSequence(0,4));

        }


    }

}
