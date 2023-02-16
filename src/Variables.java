public class Variables {

    public static void main(String[] args) {

        // 1.
        int age = 33;

        // 2.
        System.out.println(age);

        // 3.
        double balance = 18.89;

        // 4.
        int dollars = (int) balance;

        // 5.
        int dollarsRounded = (int) (balance+0.5);

        // 6.
        char letter = 'A';

        // 7.
        System.out.println(letter);

        // 8.
        System.out.println((int)letter);

        // 9.
        letter++;

        // 10.
        System.out.println(letter);

        // 11.
        System.out.println((int)letter);

        // 12.
        /**
         Each char character corresponds to a decimal value, and when a char character is casted to an int, the result is the corresponding decimal value of that character.
         In question 6, the char is 'A', and since the corresponding value of 'A' is 65, 65 returned when 'A' is casted to an int in question 8.
         In question 9, when the char letter is incremented, it becomes 'B' which has a corresponding value of 66, which returned when 'B' is casted to an int in question 11.

         **/

    }
}
