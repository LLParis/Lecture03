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

        if (name1.compareTo(name2) < 0) {
            System.out.println(name1 + " goes before " + name2);
        } else if (name1.compareTo(name2) > 0) {
            System.out.println(name2 + " goes before " + name1);
        } else {
            System.out.println("These are the same.");
        }


        // 23. Write code to read a line of input from the user and print the words of
        // that line in sorted order, without removing duplicates. For example, the
        // program output might look like the following:

        // Type a message to sort:  to be or not to be that is the question
        // Your message sorted: be be is not or question that the to to
        System.out.println("Type a message to sort: ");
        String message = input.nextLine();
        ArrayList<String> chars = new ArrayList<>(Arrays.asList(message.split(" ")));
        for (int i = chars.size() - 1; i < 0; i--) {
            if (chars.get(i).compareTo(chars.get(i - 1)) < 0) {
                String element = chars.get(i);
                chars.remove(i);
                chars.add(0, element);
            }
        }
        Collections.sort(chars);
        System.out.println(chars);

        // EXERCISES:
        // From section 10.2:
        // 20. Implementing the compareTo method.
        CalendarDate date1 = new CalendarDate(07, 18, 1995);
        CalendarDate  date2 = new CalendarDate(03, 02, 2001);

        if (date1.compareTo(date2) < 0) {
            System.out.println(date1.toString() + " comes before " + date2.toString());
        } else if (date1.compareTo(date2) > 0) {
            System.out.println(date2.toString() + " comes before " + date1.toString());
        } else {
            System.out.println("These are both the same birthday!");
        }

    }
}

class CalendarDate implements Comparable<CalendarDate> {
    private int month;
    private int day;
    private int year;

    public CalendarDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public int compareTo(CalendarDate other) {
        if (this.year != other.year) {
            return this.year - other.year;
        } else if (this.month != other.month) {
            return this.month - other.month;
        } else {
            return this.day - other.day;
        }
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
