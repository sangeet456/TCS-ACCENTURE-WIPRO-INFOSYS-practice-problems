public class leetcode1694 {
    class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '-' || number.charAt(i) == ' ') {
                continue;
            }
            sb.append(number.charAt(i));
        }

        String s = sb.toString();
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int i = 0;

        while (i < n) {
            if (n - i == 4) {
                result.append(s.charAt(i));
                result.append(s.charAt(i + 1));
                result.append('-');
                result.append(s.charAt(i + 2));
                result.append(s.charAt(i + 3));
                break;
            } else if (n - i <= 3) {
                while (i < n) {
                    result.append(s.charAt(i));
                    i++;
                }
                break;
            } else {
                result.append(s.charAt(i));
                result.append(s.charAt(i + 1));
                result.append(s.charAt(i + 2));
                result.append('-');
                i += 3;
            }
        }

        return result.toString();
    }
}
}
