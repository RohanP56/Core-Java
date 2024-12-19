class Squre{
    int side;
    //side
    public int side(){
        return side;
    }
    //perimeter
    public int perimeter(){
        return 4*side;
    }
    //area
    public int area(){
        return side*side;
    }

}
public class ch8_pr3 {
    public static void main(String[] args) {
        Squre s = new Squre();
        s.side = 3;
        System.out.println("Size of 1 side = "+s.side());
        System.out.println("Size of area = "+s.area());
        System.out.println("Size of perimeter = "+s.perimeter());
    }
    
}
