class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0) return 0;
        int index = 0;
        boolean isNegative = false;
        if (s.charAt(0) == '-') {
            isNegative = true;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }
        return convert(s, index, 0, isNegative);
    }

    public int convert(String s, int i, int num, boolean isNegative) {
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            if (isNegative)
                return -num;
            return num;
        }
        int digit = s.charAt(i) - '0';
        if (!isNegative && (num > (Integer.MAX_VALUE - digit) / 10)) {
            return Integer.MAX_VALUE;
        }
        if (isNegative && (num > (Integer.MAX_VALUE - digit) / 10)) {
            return Integer.MIN_VALUE;
        }
        num = num * 10 + digit;
        return convert(s, i + 1, num, isNegative);
    }
}