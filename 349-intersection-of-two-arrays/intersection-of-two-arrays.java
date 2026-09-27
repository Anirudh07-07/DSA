class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n = nums1.length;
        int m = nums2.length;

        int i = 0;
        int j = 0;

        while (i < n && j < m) {

            // duplicate skip
            if (i > 0 && nums1[i] == nums1[i - 1]) {
                i++;
                continue;
            }

            if (nums1[i] < nums2[j]) {
                i++;
            }
            else if (nums1[i] > nums2[j]) {
                j++;
            }
            else {
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }

        // ArrayList -> int[]
        int[] result = new int[ans.size()];

        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }

        return result;
    }
}