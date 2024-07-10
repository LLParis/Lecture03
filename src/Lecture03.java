import java.util.*;

class Lecture03 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 03");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // 21. Consider the following variable declarations:
        // Integer n1 = 15;
        // Integer n2 = 7;
        // Integer n3 = 15;
        // String s1 = "computer";
        // String s2 = "soda";
        // String s3 = "pencil";

        // Indicate whether the result of each of the following comparisons is positive,
        // negative, or 0:

        // A:
        // n1.compareTo(n2)
        // Positive

        // B:
        // n3.compareTo(n1)
        // 0

        // C:
        // n2.compareTo(n1)
        // Negative

        // D:
        // s1.compareTo(s2)
        // Negative

        // E:
        // s3.compareTo(s1)
        // Positive

        // F:
        // s2.compareTo(s2)
        // 0

        // 22. Use the compareTo method to write code that reads two names from the
        // console and prints the one that comes first in alphabetical order. For
        // example, the program’s output might look like the following:

        // Type a name: Tyler Durden
        // Type a name: Marla Singer
        // Marla Singer goes before Tyler Durden
        Scanner input = new Scanner(System.in);
        String name1;
        String name2;

        System.out.print("Type a name: ");
        name1 = input.nextLine();
        System.out.println();
        System.out.print("Type a name: ");
        name2 = input.nextLine();
        System.out.println();


        // 23. Write code to read a line of input from the user and print the words of
        // that line in sorted order, without removing duplicates. For example, the
        // program output might look like the following:

        // Type a message to sort:  to be or not to be that is the question
        // Your message sorted: be be is not or question that the to to

        // EXERCISES:

        // None
    }
}
