class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        // 2. We only need to reverse half of the number. 
        // When x becomes less than or equal to reversedHalf, we've reached the middle.
        while (x > reversedHalf) {
            int lastDigit = x % 10;
            reversedHalf = (reversedHalf * 10) + lastDigit;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }
}