class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int height, int radius){
        this.height = height;
        this.radius = radius;
    }
    
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setHeight(int height){
        this.height = height;
    }

}


public class ch9_pr3 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(12, 9);
        System.out.println("Radius of cylinder is : "+c.getRadius());
        System.out.println("Height of cylinder is : "+c.getHeight());
    }
    
}
