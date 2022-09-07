import java.util.ArrayList;
import java.util.List;

public class allDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));

    }
         static List<Integer> findDuplicates(int[] nums) {
            ArrayList<Integer> res = new ArrayList<>();
            for(int i = 0;i<nums.length; i++){
                int assumeIndex = Math.abs(nums[i]) -1;
                if(nums[assumeIndex] < 0){
                    res.add(Math.abs(nums[i]));
                }
                nums[assumeIndex] = -nums[assumeIndex];
            }
            return res;

        }

}
