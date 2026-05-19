import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){
        //return index of target sum

        int [] nums = {2,5,5,11};
        int target =10;

        //Approach 1 - for loop O(N^2)
        //ans = bruteTwoSum(nums, target);i
        int[] ans = new int[2];

        //Approach 2 - HashMap O(N)
        ans = optimizedTwoSum(nums,target);
        System.out.println(Arrays.toString(ans));
        }

        public static int[] optimizedTwoSum(int[]nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int pair = target-nums[i];
                if(map.containsKey(pair))
                return new int[]{map.get(pair),i};
                else map.put(nums[i],i);
            }
            return new int[]{-1,-1};
        }


        public static int[] bruteTwoSum(int[]nums, int target){

        for(int i =0;i<nums.length;i++){
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]+nums[j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
