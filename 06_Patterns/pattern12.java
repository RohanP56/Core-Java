//floyd's triangle
public class pattern12 {
    public static void floyds_triangle(int n){
        int k = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyds_triangle(4);
    }
    
}

/*
1 
2 3 
4 5 6 
7 8 9 10 
 */