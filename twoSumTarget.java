import java.util.Arrays;
import java.util.HashMap;

public class twoSumTarget {
    public static void main(String[] args ) {
    int [] nums ={2, 54 ,69,33, 12, 6};
        System.out.println(Arrays.toString(twoSum(nums, 66)));
    }
    static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i]))  //Difference between array num and target = pair to get target
            {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
            }
            map.put(nums[i], i);
        }
        return result;

    }
}
