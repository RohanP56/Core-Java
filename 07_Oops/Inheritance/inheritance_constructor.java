class Horse{
    Horse(){
        System.out.println("Horse is from base class");
    }
    Horse(int a){
        System.out.println("Horse class constructor with int a arguement (Overloaded constructor)");
    }
}
class Mustang extends Horse{
    Mustang(){
        //super(6);   ---> if we use it it will executr the constructor with arguement/// super(6), 6 in the bracket for (int a) arguement
        System.out.println("Mustang is from base class");
    }
    
    Mustang(int a, int b){
        super(a);
        System.out.println("constructor with a and b");
    }
}


public class inheritance_constructor {
    public static void main(String[] args) {
        //Horse h = new Horse();
        //Mustang m = new Mustang();
        Mustang m1 = new Mustang(5, 6);
    }
    
}

/*
1. In case of Inheritance, if theres constructor in both (base and derived) class, then 1st base class constructor will be execute, then derived class constructor will be execute.
 
2. If there multiple constructor in base class then, the constructor without any attribute will run by default.

3. if we want that the derive class by default run the constructor with attribute then we have to use (super) keyword
 */