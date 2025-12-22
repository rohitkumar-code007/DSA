//import java.util.Scanner;
import java.util.Arrays;
class bind{
 public static void main(String[] args){
//Scanner n=new Scanner(System.in);
         //int num1 = n.nextInt();
//int r=nextint();
//int c=nextint();
int[][] arr=  {{2,7,9},
                {5,6,8},
                {6,11,14}};
int t=8;
System.out.print(Arrays.toString(bin(arr,t)));
}
/*static int[] sea(int[][] arr,int t){
    int[] a={-1,-1};
 
/*for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
if(arr[i][j]==t){
 a[0]=i;
 a[1]=j;}
}} return a;
 
}*/
static int[] bin(int[][] ar,int t){
    int s=0;
    int e=ar.length-1;
while(s<ar.length && e>0){
    if(ar[s][e]==t){
        return new int[]{s,e};
    }
    if(ar[s][e]<t){
        s++;
    }
    else if(ar[s][e]>t){
        e--;
    }
     
     }return new int[]{-1,-1};
}}