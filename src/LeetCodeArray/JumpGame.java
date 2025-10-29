package LeetCodeArray;

public class JumpGame {
    public static boolean canJump(int[] nums){
        int goal=nums.length-1;
        boolean jump=false;
        for(int i= nums.length-2;i>=0;i--){
            if(i+ nums[i]>=goal){
                goal=i;
            }
        }
        if(goal==0){
            jump=true;
        }
        return jump;
        }
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        int[] nums2={2,3,1,0,4};
        int[] nums3={3,2,1,0,4};
        System.out.println(canJump(nums));
        System.out.println(canJump(nums2));
        System.out.println(canJump(nums3));
    }
}
