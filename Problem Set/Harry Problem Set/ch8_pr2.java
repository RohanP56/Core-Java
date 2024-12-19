class Cell_phone{
    public void startIng(){
        System.out.println("Hello Moto");
    }
    public void ringIng(){
        System.out.println("The phone is in ringing mode");
    }
    public void callIng(){
        System.out.println("The phone is busy in calling");
    }
    public void vibratIng(){
        System.out.println("The phone is on vibrate mode");
    }
}

public class ch8_pr2 {
    public static void main(String[] args) {
        Cell_phone moto = new Cell_phone();
        moto.startIng();
        moto.callIng();
        moto.vibratIng();
        moto.ringIng();
    }
    
}
