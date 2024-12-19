// 0-1 Triangle
public class pattern13 {
    public static void trangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        trangle(5);
    }
    
}


/* if (row+col = even then 1, either 0) */

/*

1
01
101
0101
10101

*/