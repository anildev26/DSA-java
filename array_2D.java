import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Matrix Row & Col Size: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Row= "+r +"Column= " +c);
        System.out.println("Enter the Matrix element: ");
        int[][] arr = new int[r][c];
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }
//      1st Method to print 2D Array
//       for (int[] element:arr) {
//            System.out.println(Arrays.toString(element));
 //       }
//      2nd Method using basic for loop
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
     sc.close();
    }
}

