
class Cylinder{
    private int radius;
    private int height;
    
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


public class ch9_pr1 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setHeight(56);
        c.setRadius(89);
        System.out.println("Radius of cylinder is : "+c.getRadius());
        System.out.println("Height of cylinder is : "+c.getHeight());
    }
    
}
