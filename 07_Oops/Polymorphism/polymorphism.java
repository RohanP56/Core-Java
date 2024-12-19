interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Hello Moto");   //we can't directly use it, but use it inside another default method
    }
    default void record4KVideo(){     //default method
        greet();     //using greet method 
        System.out.println("Recording in 4K....");
    }
}

interface Wifi{
    String [] getNetwork();
    void connectToNetwork(String network);
}

class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Dialing..."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class SmartPhone extends CellPhone implements Camera, Wifi{
    public void takeSnap(){
        System.out.println("Taking Snap..");
    }
    public void recordVideo(){
        System.out.println("Start Recording");
    }
    public String [] getNetwork(){
        System.out.println("Getting List of Network");
        String [] netwokrList = {"Vi ","jio ","airtel"};
        return netwokrList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connect to Network ..."+network);
    }

}

public class polymorphism {
    public static void main(String[] args) {
        Camera ca = new SmartPhone();
        ca.record4KVideo();
        //ca.connectToNetwork();  --> can't use it because here we using smartPhone as a camera, so wifi is not needed here [NOT ALLOWED]
        
        SmartPhone asus = new SmartPhone();   //here all methods can run
        asus.getNetwork();
        asus.connectToNetwork("jio 5g");
        asus.callNumber(100);
    }
    
}

/*when i use smartphone as a camera then i can only use camera functionalities, can't use other functionalities */