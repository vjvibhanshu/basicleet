import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Map<Character,Integer> occ = new HashMap<>();
        int window = 0;
        for(int start =0, end=0; end<s.length(); end++){
            if(occ.containsKey(s.charAt(end))){
                start = Math.max(occ.get(s.charAt(end)), start);
                System.out.println("inside IF " + start);
                System.out.println("inside End is " + end);
            }
            window = Math.max(window, end - start + 1);
            System.out.println("Window is "+ window);
            occ.put(s.charAt(end),end+1);
            System.out.println("Occur is "+ occ);

        }

        System.out.println("Ans is " + window);

    }
}
