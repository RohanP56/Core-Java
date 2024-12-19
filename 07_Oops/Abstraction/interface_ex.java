
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



public class interface_ex {
    public static void main(String[] args) {
        SmartPhone moto = new SmartPhone();
        moto.record4KVideo();
        String[] net = moto.getNetwork();
        for(String item : net){
            System.out.print(item);
        }
    }
    
}
/*if we want to add some method in interface it will throws an error because, which method we have added that have to
implements to all of the classes, to avoid this we use (default) keyword....if we use default keywod to the method, that method will
implement by default in all used classes --->>> we can also overwrite the method

In case of private method in interface we can't use it another class, so why do we create it??

>> for any reason if default method is getting larger then we implemet it as private, then call it inside default method.


*/