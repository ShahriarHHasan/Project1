package module3;
import java.util.Arrays;

public class ArraysComparing {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3};
        int[] intArray2 = {1, 2, 3};

        boolean arrayCompare =Arrays.equals(intArray, intArray2);
        System.out.println(arrayCompare);

        String[] strArray = {"cat", "fish", "seal"};
        String[] strArray2 = {"fin", "cat", "fish", "seal"};

        boolean stringCompare =Arrays.equals(strArray2, strArray);
        System.out.println(stringCompare);


    }
}
