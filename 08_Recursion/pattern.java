public class pattern {
    public static void main(String[] args) {
        int r = 5;
        int c = 5;
        pat1(r, c);
        pat2(r, c);

    }
    public static void pat1(int r, int c) {
        //basecase
        if(r==0){
            return ;
        }
        if(c<r){
            System.out.print("* ");
            pat1(r, c+1);
        }else{
            System.out.println();
            pat1(r-1, 0);
        }
    }
    public static void pat2(int r, int c) {
        //basecase
        if(r==0){
            return ;
        }
        if(c<r){
            pat2(r, c+1);
            System.out.print("* ");
            
        }else{
            pat2(r-1, 0);
            System.out.println();
            
        }
    }
    
}
