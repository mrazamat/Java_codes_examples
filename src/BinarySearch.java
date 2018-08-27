import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int key = 81;
        int low = 0;
        int high = 127;
        int[] arr = new int[128];

        for (int i = low; i < high; i++) {
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("Key is %s index of key is %s",key,runBinarySearch(arr,key,low,high));


    }

    private static int runBinarySearch(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid]>key){
                high = mid - 1;
            } else if (sortedArray[mid]==key){
                index = mid;
                break;
            }
        }
        return index;
    }
}
