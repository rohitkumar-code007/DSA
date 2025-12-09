class infinite{
    public static void main(String[] args) {
        int[] arr ={3,4,5,6,7,8,9,10,13,15,17};
        int tar=15;
        int ans=search(arr,tar);
        System.out.println(ans);
    }
    static int search(int[] arr,int tar){
        int s=0;
        int e=1;
        // Expand the window until arr[e] >= tar or e exceeds array length
        while (tar > arr[e]) {
            int temp = e + 1;
            e = e + (e - s + 1) * 2;
            if (e >= arr.length) {
                e = arr.length - 1;
                s=temp;
            }
        }
        int h = Searchind(arr, tar, s, e);
        return h;
    }


    static int Searchind(int[] arr,int tar,int s,int e){
        while(s<=e){
            int mid =s+(e-s)/2;
            if(arr[mid]==tar){
                return mid;}
            else if(arr[mid]<tar){
                s=mid+1;}
            else{e=mid-1;
            }
            }
            return -1;
        }
    }
    