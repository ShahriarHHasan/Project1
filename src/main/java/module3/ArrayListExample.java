package module3;

import java.util.ArrayList;

public class ArrayListExample
{
    public static void main(String[] args) {

        //Creating a new ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        fruits.add("orange");
        fruits.add("apple");
        fruits.add("watermelon");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(fruits);

        System.out.println(fruits.size());

        System.out.println(fruits.get(1));

        for(String fruit :fruits){
            System.out.println(fruit);
        }

        for(Integer number:numbers){

            if (number % 2 == 0) {
                System.out.println(number + "is even");
            } else {
                System.out.println(number + "is odd");
            }
        }

        //remove items
        fruits.remove(2);
        System.out.println(fruits);

        //checking if there     are any items   present     in the list

        boolean elementPresentStatus= fruits.contains("apple");
        System.out.println(elementPresentStatus);

        //clear the list

        fruits.clear();
        System.out.println(fruits);


    }
}
