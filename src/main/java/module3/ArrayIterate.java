package module3;
public class ArrayIterate {

    static Integer[] intArray = {1, 2, 3, 4, 5, 6};

    static String[] strArray = {"hello", "world", "bye"};

    public static void main(String[] args) {
        printAllIntValues();
        printAllStrValues();
        printAllValues(intArray);
        printAllValues(strArray);

    }

        public static void printAllIntValues() {
            for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);
            }

        }

        public static void printAllStrValues() {

            for (int i=0; i < strArray.length; i++) {
                System.out.println(strArray[i]);
            }
        }

        public static <T> void printAllValues (T[] array) {

        for (int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        }




    }

