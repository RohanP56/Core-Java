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

public class ch11_pr5 {
    public static void main(String[] args) {
        Monkey m = new Human();
        //m.speak();  ---> Can't use
        m.bite();
        basicAnimal don = new Human();
        //don.speak();   ---> Can't use
        don.sleep();
    }
    
}
