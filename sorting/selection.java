 import java.util.Arrays;
class selection{
public static void main(String[] args){
int[] arr={4,5,1,2,3};
selsort(arr);
System.out.print(Arrays.toString(arr));

}
static void selsort(int[] arr){
 for(int i=0;i<arr.length;i++){
    int last=arr.length-i-1;
    int maxin=mac(arr,0,last);
    swap(arr,last,maxin);
 }
 
 }
 static void swap(int[] arr,int last,int max){
    int t=arr[last];
    arr[last]=arr[max];
    arr[max]=t;
 }
 static int mac(int[] arr,int start,int last){
    int ma=start;
    for(int i =0;i<last;i++){
if(arr[i]>arr[ma]){
    ma=arr[i];
}
    }
    return ma;
 }
} 