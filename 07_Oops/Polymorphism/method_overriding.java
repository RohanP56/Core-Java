public class method_overriding {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.eat();
        Animal a = new Animal();
        a.eat();


    }
    
}
//Parent class
class Animal{
    void eat(){
        System.out.println("It eats anythings");
    }
}
//Chiild class
class Lion extends Animal{
    @Override   //@Override --> it just a notation we can use if if we wish, it helps to detect error (if we create any change in base class method then it will show an error here)
    void eat(){
        System.out.println("It eats meat");
    }
}


/*when overriding occurs if a parent class and child class have same function but different defination then if we create child class
  object it will call child class function
 */