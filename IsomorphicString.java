import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        String t= "title";
        String s = "paper";

        System.out.println(isIsomoarphic(t,s));

    }
    static boolean isIsomoarphic(String t, String s){
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Character> dict = new HashMap<>();
        for(int i=0 ; i<s.length(); i++){
            
            if(dict.containsKey(s.charAt(i))){
                if(dict.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            } else {
                if (dict.containsValue(t.charAt(i)))
                    return false;
                dict.put(s.charAt(i), t.charAt(i));
                System.out.println(dict);
            }
        }
        
        
        return true;        
    }
    
}
