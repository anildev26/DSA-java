//Q) Cyclically rotate an array by one
//Given an array, rotate the array by one position in clock-wise direction.
import java.util.Arrays;

public class rotateClockwise {
    public static void main(String[] args) {
        int [] arr = {21,45,12,54};
        int n = arr.length;
        rotate(arr, n);
        System.out.println(Arrays.toString(arr)); //[54,21,45,12]
     }
    static void rotate(int[] arr,int n){ //arr = {21,45,12,54}, n = 3
//
        for(int i=0; i<n; i++){ //0 = 21, 1 = 45, 2 = 12, 3 = 54
            int temp = arr[i]; // [when i = 0: temp = 21 (arr[0])] , [when i = 1: temp = 45 (arr[1]=45)] , [when i = 2: temp = 12 (arr[2]=12)] , [when i = 3: temp=54 (arr[3]=54)]
            arr[i]= arr[0]; // [when i = 0: arr[i] = 21 (arr[0]=21)] , [when i = 1: arr[1] = 21 (arr[0]=21)] ,[when i = 2: arr[2] = 45 (arr[0]=45)] , [when i = 3: arr[3]=12 (arr[0] =12)]
            arr[0] = temp; // [when i = 0: arr[0] = 21 (temp=21)] , [when i = 1: arr[0] = 45 (temp=45)] , [when i = 2: arr[0] = 12 (temp=12)] , [when i = 3: arr[0] = 54 (temp = 54)]
        }

    }
}
