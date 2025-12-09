public class linear{
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,10,12,14};
        int k=10;  
        System.out.println(Linearsearch(arr,k)); 

        
    }
    static int Linearsearch(int arr[],int k){
        if (arr.length==0){
            return -1;
        }
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==k){
                return i++;

            }
        }
       return -1;}
        

    }
