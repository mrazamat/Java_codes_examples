import java.util.Arrays;

public class BinarySearchOnCharArray {
    // How to find or search array elements by binary search?
    public static void main(String[] args) {
        char[] chrArr = {'a', 'c', 'd', 'y', 'e', 'q', 'b'};
        int index = Arrays.binarySearch(chrArr, 0, chrArr.length - 1, 'q');
        System.out.println("Char 'q' index is: " + index);
    }
}
