class Player{
    public static void hittIng() {
        System.out.println("chareter is ready to Hitting");
    }
    public static void runnIng() {
        System.out.println("now run");
    }
    public static void fireIng() {
        System.out.println("start fireing");
    }
}
public class ch8_pr5 {
    public static void main(String[] args) {
        Player franklin = new Player();
        franklin.hittIng();
        franklin.runnIng();
        franklin.fireIng();
    }
    
}
