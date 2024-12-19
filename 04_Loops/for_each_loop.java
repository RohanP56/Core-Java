//for-each loop only applicable for array
public class for_each_loop {
    public static void main(String[] args) {
        int [] number = {45, 88, 36, 78, 96, 36, 47, 20, 12};
        for(int i : number){
            System.out.println(i);
        }
    }
}


/*    SYNTAX =====>>>

for (type var : array) 
{ 
    statements using var;
}

 */