 
public class seabinary {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 5},
                       {9, 4, 8},
                       {6, 1, 7}};

        int maxNumber = findMax(arr);
        System.out.println("The maximum number in the 2D array is: " + maxNumber);
    }

    // This method finds and returns the max value in a 2D array.
    static int findMax(int[][] arr) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            // Return a default value or throw an exception for an empty/null array.
            return Integer.MIN_VALUE; // or throw new IllegalArgumentException("Array is empty or null");
        }

        int max = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
      