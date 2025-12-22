import java.util.Arrays;
class bubble{
public static void main(String[] args){
int[] arr={4,8,7,2,9,0,3};
bubbe(arr);
 System.out.println(Arrays.toString(arr));
}
static void bubbe(int[] arr){
  boolean Swapped;
//this is xternal loop  for 
for(int i=0;i<arr.length;i++){
    Swapped=false;
    for(int j=1;j<arr.length-i;j++){
        if(arr[j]<arr[j-1]){
            int t=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=t;
            Swapped=true;
        }
    }
    if(!Swapped){
        break;
    }
}

/*if(!Swapped){
    break;
}*/
 }}