package array;

public class binarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{ 1, 2, 5, 8, 15, 23, 32 };
        int needle = 5;
        int arrayLength = array.length - 1;

        int position = binarySearchFunction(array, needle, 0, arrayLength);

        if(position >=0) {
            System.out.println("Needle found at position " + position);
        } else {
            System.out.println("Needle not found");
        }
    }

    private static int binarySearchFunction(int[] haystack, int needle, int start, int end){
        int middle = start + Math.round((float)((end - start)/2));

        if(start > end){
            return -1;
        }

        if(haystack[middle] == needle){
            return middle;
        }

        if(needle < haystack[middle]){
            return binarySearchFunction(haystack, needle, start, middle - 1);
        } else {
            return binarySearchFunction(haystack, needle, middle + 1, end);
        }
    }
}
