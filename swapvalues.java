import java.util.Arrays;
import java.util.Scanner;

public class swapvalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array of size 5: ");
        int[] arr = new int[5];
        for (int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void swap(int []arr, int index1, int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
