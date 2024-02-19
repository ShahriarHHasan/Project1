package module3;
import java.util.Arrays;
public class ArrayFilling {
    public static void main(String[] args) {

        int[] array = new int[50];

        Arrays.fill(array,3);
//accepts only same value to array
        System.out.println(Arrays.toString(array));


    }
}
