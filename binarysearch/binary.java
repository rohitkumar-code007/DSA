class binary{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int tar = 5;
        binary obj = new binary();
        int ans = obj.binarysearch(arr, tar);
        System.out.println(ans);
        
    }
    int binarysearch(int[] arr,int tar){

        int s=0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==tar){
                return mid;
            }
            else if(arr[mid]<tar){
                s=mid+1;
            }
            else{
                e=mid-1;
            }   
        }
        return -1;
     
}  }  