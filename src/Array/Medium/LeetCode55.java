package src.Array.Medium;

public class LeetCode55 {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,3,1,1,0,1}));

    }

    public static boolean canJump(int[] nums) {
        boolean isReachable = isReachableByJump(0, nums);
        return isReachable;
    }

    private static boolean isReachableByJump(int currentIndex, int[] nums) {
        boolean bol=false;
        if (currentIndex + nums[currentIndex] >= nums.length-1) {
            return true;
        }
        for (int i = 1; i <=nums[currentIndex] ; i++) {
            bol= isReachableByJump(currentIndex+i,nums);
            if(bol == true){
                return true;
            }
        }
        return false;
    }
}
