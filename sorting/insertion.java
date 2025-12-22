import java.util.Arrays;
class insertion{
public static void main(String[] args) {
int[] arr={5,3,7,2,8,1,4,6};
Intsort(arr);
    System.out.print(Arrays.toString(arr));
 
}
static void Intsort(int[] arr){
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j>0;j--){
            if(arr[j]<arr[j-1])
            {swap(arr,j,j-1);}
            else{
                break;
            }

        }
    }
}
static void swap(int[] arr,int i,int j){
    int t=arr[i];
    arr[i]=arr[j];
    arr[j]=t;
}}
