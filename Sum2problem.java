import java.util.HashMap;
import java.util.Map;

public class Sum2problem {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
      //  int diff = 0;
        Map<Integer, Integer> preval = new HashMap<>();
        int[] ans;
        
        for(int i = 0; i<nums.length;i++){
           int diff = target - nums[i];
            if(preval.containsKey(diff)){
               ans = new int[] {preval.get(diff),i};
               System.out.println(ans);
            }
            preval.put(nums[i], i);
        }
       // ans = null;
        
    }
}
