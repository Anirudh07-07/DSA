class Solution {
    public int totalNumbers(int[] digits) {
        int ans = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 8; k += 2) {
                    int a = 0, b = 0, c = 0;

                    for (int x : digits) {
                        if (x == i) a++;
                        if (x == j) b++;
                        if (x == k) c++;
                    }

                    if (i == j && j == k) {
                        if (a >= 3) ans++;
                    } else if (i == j) {
                        if (a >= 2 && c >= 1) ans++;
                    } else if (i == k) {
                        if (a >= 2 && b >= 1) ans++;
                    } else if (j == k) {
                        if (b >= 2 && a >= 1) ans++;
                    } else {
                        if (a >= 1 && b >= 1 && c >= 1) ans++;
                    }
                }
            }
        }

        return ans;
    }
}