import java.util.Arrays;

public class MyArrayCopy {
    public static void main(String[] args) {
        int[] myArr = {22, 42, 2, 4, 23, 46, 64, 2};
        System.out.println("Array size before copy: " + myArr.length);
        int[] newArr = Arrays.copyOf(myArr, 15);
        System.out.println("New array size after copying: " + newArr.length);
    }
}
