import java.util.ArrayList;

public class commonElementInThreeArray {
    public static void main(String[] args) {
        int [] A = {1, 5, 10, 20, 40, 80};
        int [] B = {6, 7, 20, 80, 100};
        int [] C = {3, 4, 15, 20, 30, 70, 80, 120};
        int n1 = A.length;
        int n2 = B.length;
        int n3 = C.length;
        ;
        System.out.println(commonElements(A,B,C,n1,n2,n3));
    }
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // code here
        int a = 0, b = 0, c = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while(a<n1 && b< n2 && c <n3){
            if(A[a] == B[b] && B[b] == C[c]){
                if (!ans.contains(A[a])){
                    ans.add(A[a]);
                }
                a++;
                b++;
                c++;
            }
            else if(A[a]>B[b]){
                b++;
            }
            else if(B[b]>C[c]){
                c++;
            }else {
                a++;
            }

        }
        return ans;


    }
}
