package module3;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayFunctions {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(intArray[5]);
        System.out.println(intArray.length);

        //sorting

        String[] StringArray = {"one", "two", "three", "four", "five", "six"};

        Arrays.sort(StringArray);
        System.out.println(Arrays.toString(StringArray));

        //Sorting descending
        Integer[] intArray2 = {13,42,3,4,5,6,7};
        Arrays.sort(intArray2);




    }
}
