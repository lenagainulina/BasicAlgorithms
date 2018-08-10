/*
Write a function that transforms characters in a string to an opposite case (lower case to upper case and vice versa)

 There're different solutions (e.g. splitting a string into substrings and looping though each substring to check its case)
 The solution with a mutable class StringBuilder allows to generate strings without recreating a string object in memory.
 We convert a string input into an array of characters and loop over it, checking the case of each character.
 We append a character of an opposite case to a StringBuilder.
 */


public class Main {
    public static void main(String[] args) {
        String input = "SuMmER iS CooL ";
        String result = transformCase(input);
        System.out.println(result);
    }

    public static String transformCase(String input) {
        StringBuilder result = new StringBuilder(input);

        for (char character : input.toCharArray()) {
            if (Character.isLowerCase(character)) {
                result.append(Character.toUpperCase(character));
            } else {
                result.append(Character.toLowerCase(character));
            }
        }
        return result.toString();
    }
}
