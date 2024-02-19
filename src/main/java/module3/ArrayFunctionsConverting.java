package module3;
import java.util.Arrays;
public class ArrayFunctionsConverting {

    public static void main(String[] args) {


        //int to string conversion
        int[] intArray1 = {11,4,56};

        String newArray = Arrays.toString(intArray1);

        System.out.println(newArray);

        //string to int conversion

        String[] strArray = {"11","4","56"};
        int size = str.length();
        int [] arr = new int[size];;
        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
        System.out.println(Arrays.toString(arr));



    }
}
