package LeetCodeArray;

public class Occurance_2 {
    public static int removeDuplicates(int[] nums){
        //1st two index values always be unique
        int j=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[j-2]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;

    }
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
