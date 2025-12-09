class floor{
    public static void main(String args[]){
        int[] arr = {1,2,8,10,11,12,19,20,31};
        int tar = 40;
        System.out.println(fl(arr,tar));

    }
    static int fl(int arr[],int tar){
        if(tar<arr[0]){
            return -1;
        }
        else if(tar>arr[arr.length-1]){
            return -1;
        }
        int s= 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] ==tar)
            {
                return arr[mid];
            }
            else if(arr[mid] <tar){
            s = mid+1;
            }           
            else if(arr[mid] >tar){
                e = mid-1;
            }
            else{
                return -1;
            }
        }

        return arr[e];}
}