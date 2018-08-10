/*
Write a function, that compares two lines and checks, if they follow the same pattern.
Hint: the pattern is circular. aabba = baaab; cdcdcc = dcccdc.

Solution:
1. both strings have to have the same length to be compared.
2. Check the length of the string.
3. Iterate over the string according to its length.
4.Compare the strings after each iteration to see, if they match. Once the matching combination is found, return true.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(isCircular("aabbaac", "aacaabb"));
    }

    public static boolean isCircular(String input1, String input2){
        if (input1.length()!=input2.length())
            return false;
        for(int i=0; i<input1.length()-1; i++){
            //   input1 = new StringBuilder(input1.substring(1)).append(input1.charAt(0)).toString();
            input1 =  input1.charAt(input1.length()-1)+input1.substring(0, input1.length()-1);
            if (input1.equals(input2))
                return true;
        }
        return false;
    }
}
