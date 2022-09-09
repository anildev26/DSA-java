import java.util.Arrays;

public class minimizetheHeights {
    public static void main(String[] args) {
        int k = 2;
        int n = 4;
        int [] arr = {1, 2, 5, 4};
        System.out.println(getMinDiff(arr,n,k));

    }
        static int getMinDiff(int[] arr, int n, int k) {
            Arrays.sort(arr);
            int mini, maxi;
            int result = arr[n - 1] - arr[0];
            for (int i = 1; i < n; i++) {
                maxi = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                mini = Math.min(arr[i] - k, arr[0] + k);
                if (mini < 0)
                    continue;
                result = Math.min(result, maxi - mini);
            }
            return result;
        }

}
