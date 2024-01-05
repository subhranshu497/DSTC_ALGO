public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums){
        boolean flag = false;
        int i =0;
        while(i<nums.length){
            if(nums[i] !=0 && i != nums.length-1){
                i +=nums[i];
            }
            else return false;
        }
        if(i == nums.length-1) return true;
    }
}
