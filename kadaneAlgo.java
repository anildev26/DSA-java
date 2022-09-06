//Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number)
// which has the maximum sum and return its sum.

public class kadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {-2,-5,-6,1,-3};
        int cur_sum = 0;
        int total_sum = 0;
        int max = 0;
        int min = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            cur_sum = cur_sum + arr[i];

            if (cur_sum > total_sum) {
                total_sum = cur_sum;
            }

            if (cur_sum>min) {
                min = cur_sum;
            }

            if (cur_sum < 0) {
                cur_sum = 0;
            }

            max = Math.max(cur_sum, total_sum);
        }

        if (min < 0) {
            System.out.println(min);
        } else {
            System.out.println(max);
        }

    }
}
