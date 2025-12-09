public class maxwealth{
    public static void main(String[] args) {
        int[][] acc ={{1,2,37},{3,2,1},{8,6,9}};
        System.out.println(max(acc));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] arr1 : arr) {
            int sum =0;
            for (int j = 0; j < arr1.length; j++) {
                sum += arr1[j];
            }
            if(sum>max){
                max =sum;
            }
        }
        return max;}
}

