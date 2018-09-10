
public class Main {

    public static void main(String[] args) {
        String setofletters = "aaabcdgztriuebbbbbbccccc";

        System.out.println(maxNumRepeatChar(setofletters));
        System.out.println(maxSubstrRepeatCharArray(setofletters));
        System.out.println(maxSubstrNoRepeatChar(setofletters));

    }

    public static int maxNumRepeatChar(String str) {
        int max = 0;
        int temp = 1;
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {

                ++temp;

            } else {

                temp = 1;
            }
            if (temp > max) {

                max = temp;
            }
        }
        return max;
    }

    public static String maxSubstrRepeatCharArray(String str) {
        String temp = "";
        String max = "";
        char[] arr = str.toCharArray();

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                temp += arr[i];

            } else {

                if (temp.length() > max.length()) {
                    max = temp;
                }
                temp = String.valueOf(arr[i]);
            }
        }
        return max;
    }

    public static String maxSubstrNoRepeatChar(String str) {
        StringBuffer temp = new StringBuffer();
        StringBuffer max = new StringBuffer();
        char c;

        for (int i = 0; i < str.length() - 1; i++) {
            c = str.charAt(i);
            temp.append(c);

            if (c == str.charAt(i + 1)) {

                if (temp.length() > max.length()) {
                    max.setLength(0);
                    max.append(temp);
                }
                temp.setLength(0);
            }
        }
        return max.toString();
    }
}