import java.util.Arrays;
import java.util.Scanner;

public class array_iterate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int [] roll = new int[5];

        for (int i = 0; i<roll.length; i++){
            roll[i] = sc.nextInt();
        }
//      1 st Method to print:
        for (int i = 0; i<roll.length; i++){
            System.out.print(roll[i] + " " );
        }
//      2nd Method to print using for each:
        for (int num:roll) {
            System.out.print(num + " ");
        }
//      3 rd direct method to print:
        System.out.println(Arrays.toString(roll));
        sc.close();
    }

}
