import java.util.Arrays;

class arrangeNegativeNums{
    public static void main(String args[]){
        int [] arr ={2, -8, 5, 64, -2, -7};
        segregateElements(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void segregateElements(int arr[])
    {
        // Your code goes here
        int low = 0;
        int high = arr.length-1;
        while(high>=low){
            if(arr[low]<0){
                low++;
            }else{
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high --;
            }
        }
    }
}