package Laboratorium6.zad_62;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();

        hash.add("ala");
        hash.add("kasia");
        hash.add("tomek");
        hash.add("wiola");
        hash.add("lukasz");
        hash.add("bonifacy");

        System.out.println(hash);


        Object [] tablica = hash.toArray();
        for(int i = 0 ; i < tablica.length ; i++){
            System.out.println(tablica[i]);
        }



    }

}
