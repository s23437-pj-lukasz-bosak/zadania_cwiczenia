package levelUp;

public class Test {

    public static void main(String[] args) {

        NewHero hero1 = new NewHero();
        hero1.heroClassChoose();
        System.out.println("twoje statystyki: siła = " + hero1.getStrenght()
                + " , celność =  " + hero1.getDexterity() + " , inteligencja = " + hero1.getIntelligence() + " , obrona = " + hero1.getDefence()
                    + " , agility = " + hero1.getAgility() + " , prędkość = " + hero1.getSpeed());



    }


}
