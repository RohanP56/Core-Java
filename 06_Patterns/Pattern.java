class Pattern{

    //solid Rectangle
    public static void rectSolid(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //half pyramid
    public static void halfPyram(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //inverted hald pyramid
    public static void invHalfPyr(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //inverted half pyramid with number
    public static void invHalfPyrWthNum(int n) {
        for(int i=1;i<=n;i++){
            int k = 1;
            for(int j=1;j<=n-i+1;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    //half pyramid with number
    public static void halfPyrWthNum(int n) {
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    //floyd's triangle with alphabet
    public static void floydTriAngWthAlph(int n) {
        char a = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }

    //floyd's triangle with number
    public static void floydTriAngWthNum(int n) {
        int a = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }

    //hollow rectangle
    public static void hollowReact(int rows, int cols) {
        //outer loops ---> Rows
        for(int i=1;i<=rows;i++){  
            //inner loop ---> clos
            for(int j=1;j<=cols;j++){
                //cell (i, j)
                if(i==1 || i==rows || j==1 || j==cols){   //boundary condition
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //inverted rotated half pyramid
    public static void invRotaHalfPyramid(int n) {
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //inverted rotated half pyramid with number
    public static void invRotaHalfPyramidNum(int n) {
        int l = 1;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=i;k++){
                System.out.print(l);
                l++;
            }
            System.out.println();
        }
    }

    //   0 - 1 Triangle
    public static void zerOneTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){           //if (row + col = even, then 1)
                    System.out.print("1");
                }else{                          //if (row + col = odd, then 0)
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 5;
        int rows = 5;
        int cols = 10;
        hollowReact(rows, cols);
        halfPyram(n);
        rectSolid(n);
        invHalfPyrWthNum(n);
        invHalfPyr(n);
        halfPyrWthNum(n);
        floydTriAngWthAlph(n);
        floydTriAngWthNum(n);
        invRotaHalfPyramid(n);
        invRotaHalfPyramidNum(3);
        zerOneTriangle(n);
        
        
    }
}