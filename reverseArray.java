import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {12, 54,42, 10 ,56 };
        System.out.println("Before Swapping: "+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("After Swapping: " + Arrays.toString(arr));

    }
    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int []arr, int index1, int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
