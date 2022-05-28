package pjwstk;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Bolesław" , "Prus" , 55);
        System.out.println(a1);
        Author a2 = new Author("Bolesław" , "Prus" , 55);
        a2.setSurname("Leśmian");
        System.out.println(a2);
        Author a3 = new Author("Eliza" , "Orzeszkowa" , 34);
        System.out.println(a3);
        System.out.println("test getterow:  Name: " + a3.getName() + " Age: " + a3.getAge());
    }


}
