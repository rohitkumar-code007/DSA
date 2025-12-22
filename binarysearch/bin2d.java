class bind2d{
    public static void main(String[] args){


    }
    static int[] sear(int[][] arr,int ta){
       int r=arr.length;
       int c=arr[0].length;
       if(r==1){
bin(arr,r,ta,0,c-1);
       } 
    int rstart=0;
    int rEnd=r-1;
    int cmid=c/2;
while(rstart<rEnd-1){
int mid=rstart+(rEnd-rstart)/2;
if(arr[mid][cmid]==ta){
    return new int[]{mid,cmid};
    
}
}
    }
    static int[] bin(int[][] arr,int r,int t,int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[r][m]==t){
                return new int[]{r,m};
            }
            if(arr[r][m]>t){
                e=m-1;
            }
            else{s=m+1;}


            }
            return new int[]{-1,-1};
        }
    }
