package levelUp;

import java.util.Scanner;

public class NewHero {
    Scanner skaner = new Scanner(System.in);



    public int heroClassChoose() {

        int choose;

        System.out.println("Witamy w kreatorze postaci");
        System.out.println(" do wyboru masz 3 klasy");
        System.out.println("1 - Mage");
        System.out.println("2 - Knight");
        System.out.println("3 - Archer");
        System.out.println("Wybierz postać: ");

        for (int i = 0; ; i++) {
            choose = skaner.nextInt();
            if (choose < 1 || choose > 3) {
                System.out.println("Wybierz pomiedzy 1 -3");
            } else {
                switch (choose) {
                    case 1:
                        System.out.println("wybrałes Mage");
                    case 2:
                        System.out.println("wybrałes Knight");
                    case 3:
                        System.out.println("wybrałes Archer");
                        return choose;
                }
            }
        }


    }
}

