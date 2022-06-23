package Laboratorium6.zad_63;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet<String> tree1 = new TreeSet<>();

        tree1.add("Black");
        tree1.add("Green");
        tree1.add("Orange");
        tree1.add("Red");
        tree1.add("White");

        System.out.println("A) drzewo zawierajace 5 kolorów: ");
        System.out.println(tree1);


        System.out.println("b) iterowanie po wszystkih elementach drzewa:");
        Iterator<String> iterator = tree1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        TreeSet<String> tree2 = new TreeSet<>();

        tree2.add("Black");
        tree2.add("Pink");
        tree2.add("White");

        System.out.println("c) Dodanie do istniejącego drzewa nowego drzewa binarnego: ");
        System.out.println("tree 1 " + tree1);
        System.out.println("tree 2 " +tree2);

        tree1.addAll(tree2);

        System.out.println("Po zsumowaniu: " + tree1);


        System.out.println("d) Wypisanie elementow drzewa w odwrotenj kolejnosci : ");
        System.out.println("Oryginalne drzewo tree1: " + tree1);
        System.out.println("odwrotna kolejnosc: ");
        Iterator iterator_odwrocony = tree1.descendingIterator();
        while(iterator_odwrocony.hasNext()){
            System.out.println(iterator_odwrocony.next());
        }

        // e najpierw usune wszystkie elementy dodane wczesniej do tree 1

//        tree1.removeAll(tree2);

        System.out.println(" e) Wypisanie pierwszego i ostatniego elementu przechowywanego w drzewie: ");
        System.out.println("tree 1: " + tree1);

        System.out.println("Pierwszy element drzewa: " + tree1.first());
        System.out.println("Ostatni element drzewa: " + tree1.last());

        // f

        System.out.println(" Sklonowanie drzewa binarnego do innego drzewa binarnego i wypisanie nowego drzewa na ekranie :");
        System.out.println("tree1 : " + tree1);
        TreeSet<String> tree3 = new TreeSet<>();
        tree3 = (TreeSet)tree1.clone();
        System.out.println("nowe drzewo tree3 : " + tree3);

        // g

        System.out.println("Liczba elementow, przechowywanych w drzewie: ");
        System.out.println("tree 1: " + tree1);
        System.out.println("tree 1 rozmiar: " + tree1.size());
        // h

        System.out.println("Porównywanie el. przechowywanych w dwoch drzewach binarnych");

        // System.out.println(tree1.containsAll(tree2));

        System.out.println("CZy element << Black >> w tree 1 jest taki sam jak w tree2 ?");
        if((tree1.contains("Black") == true) && (tree2.contains("Black") == true)){
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }

        System.out.println("CZy element << Green >> w tree 1 jest taki sam jak w tree2 ?");
        if((tree1.contains("Green") == true) && (tree2.contains("Green") == true)){
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }

        System.out.println("CZy element << Orange >> w tree 1 jest taki sam jak w tree2 ?");
        if((tree1.contains("Orange") == true) && (tree2.contains("Orange") == true)){
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }

        System.out.println("CZy element << Pink >> w tree 1 jest taki sam jak w tree2 ?");
        if((tree1.contains("Pink") == true) && (tree2.contains("Pink") == true)){
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }

        System.out.println("CZy element << Red >> w tree 1 jest taki sam jak w tree2 ?");
        if((tree1.contains("Red") == true) && (tree2.contains("Red") == true)){
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }

        System.out.println("CZy element << White >> w tree 1 jest taki sam jak w tree2 ?");
        if((tree1.contains("White") == true) && (tree2.contains("White") == true)){
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }
    }
}
