 import java.util.Arrays;

class startandend {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int tar = 8;
        System.out.println(Arrays.toString(search(arr, tar)));
    }

    static int[] search(int[] arr, int tar) {
        int[] ans = {-1, -1};
        ans[0] = find(arr, tar,true);
        ans[1] = find(arr, tar,false);
        return ans;
    }

    static int find(int[] arr, int tar, boolean start) {
        int s = 0, e = arr.length - 1;
        int result = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == tar) {
                result = mid;
                if (start) {
                    e = mid - 1;  // Keep searching left for first occurrence
                } else {
                    s = mid + 1;  // Keep searching right for last occurrence
                }
            } else if (arr[mid] < tar) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return result;
    }

     
}