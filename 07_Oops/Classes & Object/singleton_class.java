
class Singleton{
    int n = 0;
    private Singleton(){

    }
    private static Singleton instance; //This instance is not depend object of this class, so here we will use static
    public static Singleton getInstance(){
        //cheak whether the object is created or not
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}








public class singleton_class {
    public static void main(String[] args) {
        Singleton obj1 =  Singleton.getInstance();
        Singleton obj2=  Singleton.getInstance();

    }
    
}

/*java singleton class is a class that can have only one object (an instance of the class) at a time 

1. if we want to allow to create one object then we can't create constructor (make it private) of this class
*/