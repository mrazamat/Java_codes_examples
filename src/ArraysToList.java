import java.util.Arrays;
import java.util.List;

public class ArraysToList {
    public static void main(String[] args) {
        String[] strArr = {"JAVA","C++","PERL","PHP","PLAY" };
        List<String> strList = Arrays.asList(strArr);
        System.out.println("Created List Size: " + strList.size());
        System.out.println(strList);

    }
}
