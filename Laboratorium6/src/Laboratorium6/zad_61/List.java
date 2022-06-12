package Laboratorium6.zad_61;

import java.util.LinkedList;

public class List {
    public static void main(String[] args) {


        LinkedList<Number> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        System.out.println("Oryginal list: " + numbers);

        System.out.println(numbers.removeFirst());
        System.out.println(numbers.removeLast());


        System.out.println("The new List: " + numbers);


    }
    }
