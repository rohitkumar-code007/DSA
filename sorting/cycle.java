import java.util.Arrays;
class cycle{
    public static void main(String[] args) {
        int[] ar={3,5,2,4,1,6,8,7,9};
        CycleSort(ar);
        System.out.println(Arrays.toString(ar));

    }
    static void CycleSort(int[] arr){
     
        int i=0;
        while(i<arr.length){
            int t=arr[i]-1;
            if(arr[i]!=arr[t]){
                swap(arr,i,t);
            }
            else{
                i++;}
        }
        }
        static void swap(int[] arr,int f,int l){
            int t=arr[f];
            arr[f]=arr[l];
            arr[l]=t;
        }
    }
    
    