package levelUp;

import java.util.Scanner;

public class NewHero {
    Scanner skaner = new Scanner(System.in);

    private int strenght;
    private int defence;
    private int intelligence;
    private int dexterity;
    private int agility;
    private int speed;


    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


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
                System.out.println(choose);
                switch (choose) {
                    case 1:
                        System.out.println("wybrałes Mage");
                        setDefence(10);
                        setDexterity(10);
                        setSpeed(5);
                        setIntelligence(20);
                        setStrenght(5);
                        setAgility(10);
                        break;
                    case 2:
                        System.out.println("wybrałes Knight");
                        setDefence(10);
                        setDexterity(5);
                        setSpeed(10);
                        setIntelligence(5);
                        setStrenght(20);
                        setAgility(10);
                        break;
                    case 3:
                        System.out.println("wybrałes Archer");
                        setDefence(5);
                        setDexterity(20);
                        setSpeed(10);
                        setIntelligence(10);
                        setStrenght(5);
                        setAgility(10);
                        break;

                }

                return choose;
            }
        }


    }
}

