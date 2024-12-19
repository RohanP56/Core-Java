class Monkey{
    void jump(){
        System.out.println("Jumping....");
    }
    void bite(){
        System.out.println("Does not bite");
    }
}

interface basicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements basicAnimal{
    void speak(){
        System.out.println("can speak...");
    }

    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping....");
    }
}

public class ch11_pr3 {
    public static void main(String[] args) {
        Human h = new Human();
        h.sleep();
        h.eat();
        h.bite();
    }
    
}
