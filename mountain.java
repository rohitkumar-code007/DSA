class mountain{
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,9,11,13,10,8,2};
        int p=peak(arr);
        System.out.println("peak element is;"+arr[p]);
        
    }
    
    static int peak(int[] arr){
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
    
