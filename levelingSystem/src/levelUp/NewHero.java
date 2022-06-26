package levelUp;

import java.util.Scanner;

public class NewHero {
    Scanner skaner = new Scanner(System.in);

    private double strenght;
    private double defence;
    private double intelligence;
    private double dexterity;
    private double agility;
    private double speed;



    private double baseStrenght;
    private double baseDefence;
    private double baseIntelligence;
    private double baseDexterity;
    private double baseAgility;
    private double baseSpeed;

    private String className;
    //private int promotion = 1;
    private int level = 1;
    private int points;
    private int choose;
    public int getPoints() {
        return points;
    }

    public double getStrenght() {
        return strenght;
    }

    public double getDefence() {
        return defence;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public double getDexterity() {
        return dexterity;
    }

    public double getAgility() {
        return agility;
    }

    public double getSpeed() {
        return speed;
    }

    public String getClassName() {
        return className;
    }

    public int getLevel() {
        return level;
    }


    public int heroClassChoose() {



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
                        defence = 10;
                        dexterity = 10;
                        speed = 5;
                        intelligence = 0;
                        strenght = 5;
                        agility = 10;

                        baseDefence = 10;
                        baseDexterity = 10;
                        baseSpeed = 5;
                        baseIntelligence = 100;
                        baseStrenght = 5;
                        baseAgility = 10;

                        className = "Mage";
                        break;
                    case 2:
                        System.out.println("wybrałes Knight");
                        defence = 10;
                        dexterity = 5;
                        speed = 10;
                        intelligence = 5;
                        strenght = 20;
                        agility = 10;

                        baseDefence = 10;
                        baseDexterity = 5;
                        baseSpeed = 10;
                        baseIntelligence = 5;
                        baseStrenght = 20;
                        baseAgility = 10;

                        className = "Knight";
                        break;
                    case 3:
                        System.out.println("wybrałes Archer");
                        defence = 5;
                        dexterity = 20;
                        speed = 10;
                        intelligence = 10;
                        strenght = 5;
                        agility = 10;

                        baseDefence = 5;
                        baseDexterity = 20;
                        baseSpeed = 10;
                        baseIntelligence = 10;
                        baseStrenght = 5;
                        baseAgility = 10;

                        className = "Archer";
                        break;

                }

                return choose;
            }
        }


    }

    public void levelUp(){


        System.out.println("awansujesz na wyższy poziom!");
            level ++;
            points += 10;
    }

    public double increeseInteligence(){
        switch (choose){
            case 1 :
                intelligence +=  (1.2 * baseIntelligence);
                points --;

                break;
            case 2,3 :
                intelligence += baseIntelligence;
                points --;

                break;

        }
        return intelligence;
    }

    public double increeseStrenght(){
        switch(choose){
            case 1:
                strenght += baseStrenght;
                points --;
                break;
            case 2:
                strenght = strenght + (baseStrenght * 1.2);
                points --;
                break;
            case 3:
                strenght = strenght + (baseStrenght * 1.05);
                points --;
                break;
        }
        return strenght;
    }

    public double increeseDefence(){
        switch(choose){
            case 1 :
                defence += baseDefence;
                points --;
                break;
            case 2:
                defence = defence + (baseDefence * 1.1);
                points --;
                break;
            case 3:
                defence = defence + (baseDefence * 1.05);
                points --;
                break;
        }

        return defence;
    }

    public double increeseAgility(){
        switch (choose){
            case 1 ,2 :
                agility = agility + (1.02 * baseAgility);
                points --;
                break;
            case 3 :
                agility = agility + (1.1 * baseAgility );
                points --;
                break;
        }
        return agility;
    }

    public double increeseSpeed(){
        switch ( choose){
            case 1:
                speed += baseSpeed;
                points --;
                break;
            case 2:
                speed = speed + (1.2 * baseSpeed);
                points --;
                break;
        }
        return speed;
    }

    public double increeseDexterity(){
        switch (choose){
            case 1 , 2:
                dexterity = dexterity + (1.05 * baseDexterity);
                points --;
                break;
            case 3:
                dexterity = dexterity + (1.2 * baseDexterity);
                points --;
                break;
        }
        return dexterity;
    }


    // lewelowanie chyba wyrzucic do maina albo zrobic osobna klase z levelowaniem ..
//    public void levelUp() {
//        level++;
//
//        System.out.println("Pozsotało: " + levelPoints + " punktów do rozdania.");
//        System.out.println("Wybierz którą statystykę ulepszyc: ");
//        System.out.println("1 - defence , 2 - dexterity , 3 speed , \n 4 - intelligence , 5 strenght , 6 - agility.");
//        int choose2 = skaner.nextInt();
//        switch (choose2) {
//            case 1:
//                defence = 10;
//                break;
//            case 2:
//                dexterity = 10;
//                break;
//            case 3:
//                speed = 5;
//                break;
//            case 4:
//                intelligence = 20;
//                break;
//            case 5:
//                strenght = 5;
//                break;
//            case 6:
//                agility = 10;
//                break;
//        }
//
//
//    }

}
