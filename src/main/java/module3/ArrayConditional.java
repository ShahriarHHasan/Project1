package module3;

public class ArrayConditional {

    public static void main(String[] args){
        Integer[] Numbers = {11,12,33,5,10};

        for (int number:Numbers){

            if(number%2==0){
                System.out.println(number + " is even");
            }
            else{
                System.out.println(number + " is odd");
            }
        }

        for (int number:Numbers){
            if (number>10){
                System.out.println(number + " is greater than 10");
            }

        }
    }

}
