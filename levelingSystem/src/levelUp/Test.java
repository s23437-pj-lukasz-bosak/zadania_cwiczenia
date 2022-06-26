package levelUp;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner skaner1 = new Scanner(System.in);
        NewHero hero1 = new NewHero();
        hero1.heroClassChoose();
        System.out.println("KLASA: ==== " + hero1.getClassName() + " ===== \nPOZIOM: " + hero1.getLevel() + " .\n" + "twoje statystyki: strenght = "
                + hero1.getStrenght()
                + " , dexterity =  " + hero1.getDexterity() + " , inteligence = " + hero1.getIntelligence() + " \n, defence = " + hero1.getDefence()
                + " , agility = " + hero1.getAgility() + " , speed = " + hero1.getSpeed());

        hero1.levelUp();
        System.out.println("KLASA: ==== " + hero1.getClassName() + " ===== \nPOZIOM: " + hero1.getLevel() + " .\n" + "Punkty do rozdania: "
                + hero1.getPoints());





        for (int i = hero1.getPoints(); ; i--) {
            System.out.println("podnieś wybrana statystykę:");
            System.out.println("1 - strenght , 2 - defence , 3 - inteligence , 4 - dexterity , 5 - agility , 6 speed ");
            int choseStat = skaner1.nextInt();
            switch (choseStat) {
                case 1:
                    hero1.increeseStrenght();
                    break;
                case 2:
                    hero1.increeseDefence();
                    break;
                case 3:
                    hero1.increeseInteligence();
                    break;
                case 4:
                    hero1.increeseDexterity();
                    break;
                case 5:
                    hero1.increeseAgility();
                    break;
                case 6:
                    hero1.increeseSpeed();
                    break;


            }

            System.out.println("KLASA: ==== " + hero1.getClassName() + " ===== \nPOZIOM: " + hero1.getLevel() + " .\n" + "twoje statystyki: strenght = "
                    + hero1.getStrenght()
                    + " , dexterity =  " + hero1.getDexterity() + " , inteligence = " + hero1.getIntelligence() + " \n, defence = " + hero1.getDefence()
                    + " , agility = " + hero1.getAgility() + " , speed = " + hero1.getSpeed());
            System.out.println();

            System.out.println("pozostało : " + hero1.getPoints() + " punktów do rozdania.");
            if (hero1.getPoints() <= 0) {
                System.out.println("Nie masz wystarczajacej ilosci punktów, awansuj na kolejny level");

                break;
            }
        }


    }
}
