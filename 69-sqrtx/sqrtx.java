class Solution {
    public int mySqrt(int x) {

        int i;
        for (i = 0; (long)i * i <= x; i++) {
            // loop i ko badhata rahega
        }

        return i - 1;  // kyunki last step me i*i x se bada ho jata hai
    }
}
