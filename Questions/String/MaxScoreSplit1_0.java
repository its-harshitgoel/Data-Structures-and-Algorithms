class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] ps = new int[n];
        if (s.charAt(0) == '1') {
            ps[0] = 1;
        }
        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if (c == '1') {
                ps[i] = 1 + ps[i - 1];
            } else {
                ps[i] = ps[i - 1];
            }
        }
        int zero = 0;
        int max = 0;
        for (int i = 0; i < n-1; i++) {
            if (s.charAt(i) == '0') {
                zero++;
            }

            max = Math.max(zero + ps[n - 1] - ps[i], max);

        }
        return max;
    }
}