/*
Reverse a string recursively and through looping
In production it's better to avoid recursion, because it requires more memory, can be slow and can cause a stack overflow when input values are big.
 */

public class Main {
    public static void main(String[] args) {
        String revStr = "SummeR";
        System.out.println(reverseRecursion(revStr));
        System.out.println(reverseLoop(revStr));
    }

    public static String reverseRecursion(String input) {
        if (input.length() <= 1) return input;
        return reverseRecursion(input.substring(1)) + input.charAt(0);
    }

    public static String reverseLoop(String str) {
        String res = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }
}
