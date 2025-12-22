class rotated{
    public static void main(String[] args) {
        int [] arr={1};
        int tar=0;
        System.out.println(Sea(arr,tar));
    }
    static int Sea(int[] arr,int tar){
          if(arr.length ==0){return -1;}
        int p=pivot(arr);
        
        if(p ==-1){
            return bin(arr,tar,0,arr.length-1);
            }
        if(arr[p]==tar){
            return p;
        }
        if(tar>=arr[0]){
            return bin(arr,tar,0,p);
        }
        else{
            return bin(arr,tar,p+1,arr.length-1);
        }
    }
static int pivot(int[] arr){
    int s=0;
    int e=arr.length-1;
    while(s<=e){
        int mid =s+(e-s)/2;
        if(mid < e && arr[mid] > arr[mid+1]){
            return mid;}
        if(mid > s && arr[mid] < arr[mid-1]){
            return mid-1;}
        if(arr[mid] <=arr[s]){
        e=mid-1;}
        else{
            s=mid+1;}

        }
        return -1;
        }
        

static int bin(int[] arr,int tar,int s,int e){
    while(s<=e){
        int mid =s+(e-s)/2;
        if(arr[mid]==tar){
            return mid;
            }
        else if(arr[mid]<tar){
            s=mid+1;}
        else{e=mid-1;
}
        
    }
    return -1;}
}
