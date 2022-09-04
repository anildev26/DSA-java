public class maxvalue {
    public static void main(String[] args) {
        int [] arr = {12,5,45,7,54,32,546};
        System.out.println(maxval(arr));
    }
    static int maxval(int []arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++ ){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
