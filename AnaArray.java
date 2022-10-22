import java.util.Arrays;

public class AnaArray {
    public static void main(String[] args) {
        System.out.println(isAna("anagram" , "nagaram"));
    }

    static boolean isAna(String s, String t){
        char[] chrS = s.toCharArray();
        char[] chrT = t.toCharArray();
        Arrays.sort(chrS);
        Arrays.sort(chrT);
        return Arrays.equals(chrS, chrT);
        
    }
}
