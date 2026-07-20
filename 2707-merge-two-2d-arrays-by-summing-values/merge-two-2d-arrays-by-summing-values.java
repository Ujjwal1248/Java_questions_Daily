class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0, j = 0;
        int m = nums1.length, n = nums2.length;
        List<int[]> res = new ArrayList<>();
        while (i < m && j < n) {
            if (nums1[i][0] < nums2[j][0]) {
                res.add(nums1[i]);
                i++;
            } else if (nums2[j][0] < nums1[i][0]) {
                res.add(nums2[j]);
                j++;
            } else {
                res.add(new int[] { nums1[i][0], nums1[i][1] + nums2[j][1] });
                i++;
                j++;
            }
        }
        while (i < m) {
            res.add(nums1[i]);
            i++;
        }
        while (j < n) {
            res.add(nums2[j]);
            j++;
        }
        return res.toArray(new int[res.size()][]);
    }
}