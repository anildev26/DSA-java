public class maximumProductSubarray {
    public static void main(String[] args) {
        int [] arr = {-5, 2, 11, 4, 5, 1, 0};
        int n = arr.length;
        System.out.println(maxProductSubarray(arr,n));
    }
    static long maxProductSubarray (int [] arr, int n){
        long currMaxp = 1;
        long maxp = Integer.MIN_VALUE; //120 121 150
        for (int i = 0; i< n; i++){
            currMaxp = currMaxp * arr[i];
            maxp = Math.max(currMaxp, maxp);

            if (currMaxp ==0){
                currMaxp =1;
            }
        }
        currMaxp = 1;
        for (int i = n-1; i>= 0 ; i--){
            currMaxp = currMaxp * arr[i];
            maxp = Math.max(currMaxp, maxp);

            if (currMaxp ==0){
                currMaxp =1;
            }
        }

        return maxp;
    }
}
