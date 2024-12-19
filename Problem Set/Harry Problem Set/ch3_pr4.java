// Write a java program to detect double and triple spaces in a string

public class ch3_pr4 {
    public static void main(String[] args) {
        String sentence = "  he is a  good   man";
        //double Spaces  (only 1st occurence)
        System.out.println(sentence.indexOf("  "));
        //Triple Spaces  (only 1st occurence)
        System.out.println(sentence.indexOf("   "));
    }
    
}
