class MountArr {
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,3,1};
        int tar=3;
        int i=mountpeak(tar,arr);
        System.out.println(i);
        
       // System.out.println("peak element is;"+arr[peak]);
    
     }
     static int mountpeak(int target,int[] mountainArr){
        int peak=peak(mountainArr);
        int firsttry=bin(mountainArr,target,0,peak,true);
        if(firsttry!=-1){
            return firsttry;
        }
        else{
            return bin(mountainArr,target,peak+1,mountainArr.length-1,false);
        }
     }
     static int bin(int[] arr,int target,int s,int e, boolean isAsc){
 
        while(s<=e){
            int mid=s+(e-s)/2;
           
            if( arr[mid]==target){
                return mid;}
              if (isAsc) {
            if (arr[mid] < target) s = mid + 1;
            else e = mid - 1;
        } else { // descending half
            if (arr[mid] > target) s = mid + 1;
            else e = mid - 1;
        }
        }
        return -1;


     }
    static int peak(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
             
            if(arr[mid]>arr[mid+1]){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
}