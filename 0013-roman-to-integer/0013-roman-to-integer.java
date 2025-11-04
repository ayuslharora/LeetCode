class Solution {
    public int romanToInt(String s) {

        char[] symbols = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        int[] values = {1000, 500, 100, 50, 10, 5, 1};
        int[] count = new int[7];

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            for (int j = 0; j < symbols.length; j++) {

                if (current == symbols[j]) {

                    if (i + 1 < s.length()) {

                        char next = s.charAt(i + 1);

                        if ((current == 'I' && (next == 'V' || next == 'X')) ||
                            (current == 'X' && (next == 'L' || next == 'C')) ||
                            (current == 'C' && (next == 'D' || next == 'M'))) {
                            count[j]--;
                        } else {
                            count[j]++;
                        }

                    } else {
                        count[j]++;
                    }

                    break;
                }
            }
        }

        int total = 0;

        for (int i = 0; i < values.length; i++) {
            total += count[i] * values[i];
        }

        return total;
    }
}