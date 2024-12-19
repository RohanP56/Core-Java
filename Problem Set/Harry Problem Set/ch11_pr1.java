abstract class Pen{
    abstract void refill();
    abstract void write();
}

class FountainPen extends Pen{
    void refill(){
        System.out.println("Change the refill");
    }
    void write(){
        System.out.print("Use this pen to write");
    }
    void changeNib(int n){
        System.out.printf("price of nib is %d rupees",n);
    }
}

public class ch11_pr1 {
    public static void main(String[] args) {
        FountainPen p = new FountainPen();
        //p.refill();
        p.write();
        //p.changeNib(10);
    }
    
}
