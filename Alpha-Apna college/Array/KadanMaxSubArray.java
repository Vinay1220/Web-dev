public class KadanMaxSubArray {

    public static void kadan(int nums[]) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if(currSum<0){
                currSum = 0;
            }
            max = Math.max(max, currSum);
        }
        
        System.out.println("Maximum value is = "+ max);
        
    }
    public static void main(String[] args) {
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        kadan(nums);
    }
}
