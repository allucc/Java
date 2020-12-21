import java.util.*;

class Solution {
    private static String test(String s) {
        int[] map = new int[26];
        char cur = 1000;
        for (int i = 0; i < 26; ++i) {
            map[i] = -1;
        }
        for (int i = s.length() - 1; i >= 0; --i) {
            int index = s.charAt(i) - 'a';
            if (cur > s.charAt(i)) {
                map[index] = i;
                cur = s.charAt(i);
            } else {
                if (map[index] == -1) {
                    map[index] = i;
                    cur = s.charAt(i);
                }
            }
        }
        int[] tes = Arrays.stream(map).sorted().toArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 26; ++i) {
            if (tes[i] >= 0) {
                res.append(s.charAt(tes[i]));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(test("cbacdcbc"));

    }
}