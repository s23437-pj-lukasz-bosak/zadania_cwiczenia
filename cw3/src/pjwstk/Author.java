package pjwstk;

public class Author {

    private String name;
    private String surname;
    private int age;

    Author(String name, String surname , int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString(){
        return "met toString: Author name = " + getName() + " nazwisko = " + getSurname() + " wiek = " + getAge();
    }

}
