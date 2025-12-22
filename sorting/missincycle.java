class missincycle{
    public static void main(String[] args){
        int[] arr={3,0,1};
        System.out.println(miss(arr));
    }
static int miss(int[] arr){
    int i=0;
    while(i<arr.length){
        int in=arr[i];
        if(in < arr.length && arr[i]!=arr[in]){
            swap(arr,i,in);
        } else {
            i++;
        }
        }
     for(int ind=0;ind<arr.length;ind++){
        if(arr[ind]!=ind){
            return ind;
        }

    }
    return arr.length;
    }
    static void swap(int[] arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
