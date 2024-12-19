class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }
    //overload the constructor using custom lenght & breadth
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLenght(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}


public class ch9_pr4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(45, 12); 
        System.out.println(r.getBreadth());
        System.out.println(r.getLenght());

    }
    
}
