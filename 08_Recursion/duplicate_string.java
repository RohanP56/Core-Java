//remove duplicate from given string
public class duplicate_string {
    public static void main(String[] args) {
        String s = "rroohaaaaanro";
        //int index = 0;
        StringBuilder sb = new StringBuilder();
        //boolean map = new map[26];
        removeDuplicate(s, 0, sb, map);
    }
    public static void removeDuplicate(String s, int index, StringBuilder sb, new boolean [26] arr) {
        if(index==s.length()){       //completed traversed through full string
            System.out.println(sb);
            return;
        }

        char curchar = s.charAt(index);   //current character
        if(map[curchar-'a'] == false){
            //duplicate
            removeDuplicate(s, index+1, sb, map);
        }
        else{              //if character is not duplicate
            map[curchar-'a'] = true;
            removeDuplicate(s, index+1, sb.append(curchar), map);   //if character is not duplicate then character will be added in string builder

        }
    }
    
}
