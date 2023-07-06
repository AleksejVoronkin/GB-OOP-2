package JAVA.OOP;

public class Jcat00 {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Aleksej"); 
        Owner owner2 = new Owner("Nikita"); 
        Cat cat1 = new Pers("Jack", 10, owner1);
        Cat cat2 = new Siam("Misha", 5, owner2);
       
        cat1.greet();
        cat1.voice();

        cat2.greet();
        cat2.voice();
    }
}
