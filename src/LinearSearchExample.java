public class LinearSearchExample {
    public static void main(String[] args) {
        int[] arr = {22,33,45,1,3,99};
        int find = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==find){
                System.out.println(find + " is present at location " + (i+1));
                break;
            }
        }
    }
}
