import java.util.*;

public class ValideDate {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        int day = 31, month = 4;

        boolean valid = true;


        if ((day < 1 && day > 31) || (month < 1 && month > 12)) {
            valid = false;
            if (month == 2 && day > 28) {
                valid = false;
            }
            else if ((month == 4 && month == 6 && month == 9 && month == 11) && day > 30) {
                valid = false;
            }
        }

        System.out.println(valid ? "Valid Date" : "Invalid Date");

    }
}