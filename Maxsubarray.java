public class Maxsubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int maxsum = nums[0];
        int curr = 0;

        for(int n : nums){
             curr += n;
             if (curr<0)
             {
                curr = 0;
            }
             maxsum = Math.max(maxsum, curr);

        }
        System.out.println(maxsum);
    }
    
}
