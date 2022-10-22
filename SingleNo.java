import java.util.HashMap;
import java.util.Map;

public class SingleNo {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0 ; i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i], mp.get(nums[i])+1);
            }else{
                mp.put(nums[i], 1);
            }
        }
        for(int i : nums){
            if(mp.get(i)==1){
                System.out.println(i);
                break;
            }
        }
        

    }
}
