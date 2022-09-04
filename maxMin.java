//public class maxMin {
//        public static void main(int A[],int N)
//        {
//            //code here
//            int[] a ={10,5,52,1114};
//            int n = 5;
//            int maxt = a[0];
//            for(int i = 0; i<N; i++){
//                if(a[i]>maxt){
//                    maxt = a[i];
//                }
//
//            }
//        }
//}
public class maxMin {
    public static void main(String[] args) {
        int [] arr = {12,5,45,7,4,32};
        maxval(arr);
    }
    static void maxval(int []arr){
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++ ){
            if(arr[i]>max){
                max = arr[i];
            }else
            if (arr[i]<min){
                min = arr[i];
            }
        }
        //return min;
        System.out.println("Max Value:" + max);
        System.out.println("Min Value:" + min);

    }
}
