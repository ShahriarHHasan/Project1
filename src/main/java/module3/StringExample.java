package module3;

public class StringExample
{
    public static void main(String[] args) {

        String message = "Hello world";

        int messageLength = message.length(); System.out.println(messageLength);

        char ch = message.charAt(3);
        System.out.println(ch);
        //this function gives specific character of chosen index

        int a=7; //control click the method to see what developers coded about it
        String sub = message.substring(a); //or you can put 7
        System.out.println(sub);
        //gives the letters in the index from chosen index till end

        String sub2 = message.substring(7, 10);
        System.out.println(sub2);
        //gives the letters in the chosen index till chosen length. length starts from counting 1 and index starts  from  0


        String upperCase = message.toUpperCase();
        System.out.println(upperCase);

        String lowerCase = message.toLowerCase();
        System.out.println(lowerCase);

        boolean isEqual;
        isEqual = message.equals("Hello, world!");
                // or boolean isEqual = message.equals("Hello, world!")
        System.out.println(isEqual);
        //is euqlas is case sensitive

        //if you want to ignore case sensitive:
        boolean isEqualIgnoreCase = message.equalsIgnoreCase("Hello, world!");
        System.out.println(isEqualIgnoreCase);

        int index = message.indexOf('w');
        System.out.println(index);
        //it will tell you which index the lwtter

        //index of world kora jay na? No. Index is only holding one character or one number. Ok so what if i want index range> he said lagbe na for testing

        boolean startsWith = message.startsWith("Hello");
        System.out.println(startsWith);
        //yes True because our string starts with Hello. but not hello. hello dile false ashbe because its case sensitive.

        boolean messageEndsWith = message.endsWith("world");
        System.out.println(messageEndsWith);
        //same kora jay variable name and function nane. but thak na dilam. so make it message endswith. if we make it same then we will
        //get confused are we calling a function or variable

//for class, always first letter will be uppercase. and variable doesnt matter.
        //package er naam shuru hoy lower case
        //see recording







    }
}
