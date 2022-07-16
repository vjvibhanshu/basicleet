class StringrevWithSpaces{

    public static void main(String[] args) {
        String input = "Let's take LeetCode contest";
        String[] ans = input.split(" ");
        
        StringBuilder rev = new StringBuilder();
        for(String s : ans){
            rev.append(new StringBuffer(s).reverse().toString() + " ");
        }
        System.out.println(rev.toString().trim());
        
        
        int[] house = {2,7,9,3,1};
        System.out.println(rob(house));

    }

    public static int rob(int[] nums) {
        int sum = 0;
        for (int i = 0; i<nums.length; i+=2){
            System.out.println(nums[i]);
            sum = sum + nums[i];
            if(i > nums.length - 2){
                break;
            }
        }
        return sum;
    }
}