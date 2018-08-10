/*
Reverse a string recursively
 */

public class Main {
    public static void main(String[] args) {
        String revStr = "SummeR";
        System.out.println(reverse(revStr));
    }

    public static String reverse(String input) {
        if (input.length() <= 1) return input;
        return reverse(input.substring(1)) + input.charAt(0);
    }
}
