//inverted half pyramid

public class pattern11 {

    public static void inverted_half_pyramid(int n){
        for(int i=1;i<=n;i++){
            //printing numbers
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;
        inverted_half_pyramid(5);
    }
    
}
/*          

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

 */