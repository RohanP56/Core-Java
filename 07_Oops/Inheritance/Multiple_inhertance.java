package Inheritance;
public class Multiple_inhertance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eats();
    }
}


interface Harbivore{
    void eats(){
        System.out.println("Eats Grass");
    }
}

interface Carnivore{
    void eats(){
        System.out.println("Eats Meat");
    }
}

class Bear implements Harbivore, Carnivore{
    //public void eats();
}