import java.util.ArrayList;
import java.util.Scanner;

public class array_list_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
//        System.out.println(list.size());
        for(int i = 0; i< 5; i++){
            list.add(sc.nextInt());
        }
        for(int i = 0; i< 5; i++){
            System.out.print(list.get(i)+ " ");
        }
        sc.close();

    }
}
