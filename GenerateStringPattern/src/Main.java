/*
Write a function solution that, given two integers A and B, returns a string containing exactly A letters 'a'
and exactly B letters 'b' with no three consecutive letters being the same (in other words,
neither "aaa" nor "bbb" may occur in the returned string).
Examples:
1. Given A = 5 and B = 3, your function may return "aabaabab". Note that "abaabbaa" would also be a correct answer.
Your function may return any correct answer.
2. Given A = 3 and B = 3, your function should return "ababab", "aababb", "bbaabb" or any of several other strings.
3. Given A = 1 and B = 4, your function should return "bbabb", which is the only correct answer in this case.

 */

public class Main {
    public static void main(String[] args) {
        System.out.println(genStr(5, 3));
        System.out.println(genStr(3, 3));
        System.out.println(genStr(1, 4));
    }

    public static String genStr(int N, int M) {
        char[] let = new char[N + M];
        int j = 0;

        if (N > M) {

            for (int i = 0; i < N; i++) {
                if (N > 1) {
                    let[j++] = 'a';
                    let[j++] = 'a';
                    N = N - 2;
                }
                if (M == 1) {
                    let[j++] = 'b';
                    M -= 1;
                }

                for (int k = 0; k < M; k++) {
                    if (M > 1) {
                        let[j++] = 'b';
                        let[j++] = 'b';
                        M = M - 2;
                    }
                }
            }

            if (N == 1) {
                let[j++] = 'a';
                N -= 1;
            }
            if (M == 1) {
                let[j++] = 'b';
                M -= 1;
            }
        }
        else {

            for (int i = 0; i < M; i++) {
                if (M > 1) {
                    let[j++] = 'b';
                    let[j++] = 'b';
                    M = M - 2;
                }

                if (N == 1) {
                    let[j++] = 'a';
                    N -= 1;
                }

                for (int k = 0; k < N; k++) {
                    if (N > 1) {
                        let[j++] = 'a';
                        let[j++] = 'a';
                        N = N - 2;
                    }
                }
            }

            if (M == 1) {
                let[j++] = 'b';
                M -= 1;
            }
            if (N == 1) {
                let[j++] = 'a';
                N -= 1;
            }
        }
        return String.valueOf(let);
    }
}
