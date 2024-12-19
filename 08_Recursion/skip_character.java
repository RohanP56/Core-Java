public class skip_character {
    public static void main(String[] args) {
        String s =  "afjfdaapphdaalf";
       // char a = 'a';
       System.out.println(skip(s));
       System.out.println(skipApple(s));
       System.out.println(skipApp(s));
    }
    public static String skip(String s) {
        //basecase
        if(s.isEmpty()){    //when string is empty, return empty string
            return "";
        }
        char ch = s.charAt(0);
        if(ch=='a'){    //if there's (a) present then only return substring
            return skip(s.substring(1));
        }
        else{      //if there's no (a) then add the character into substring
            return ch+skip(s.substring(1));
        }
    }

    //skip a full word
    public static String skipApple(String s) {
        //basecase
        if(s.isEmpty()){    //when string is empty, return empty string
            return "";
        }
        
        if(s.startsWith("apple")){     //if there (apple) is ppresent then skip (5) characters
            return skipApple(s.substring(5));
        }
        else{
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }

    //skip app when apple is not present
    public static String skipApp(String s) {
        //basecase
        if(s.isEmpty()){    //when string is empty, return empty string
            return "";
        }
        
        if(s.startsWith("app") && !s.startsWith("apple") ){     //if there (app) is ppresent then skip (3) characters
            return skipApp(s.substring(3));
        }
        else{
            return s.charAt(0) + skipApp(s.substring(1));
        }
    }
}
