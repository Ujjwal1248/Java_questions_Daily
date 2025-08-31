class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return most(nums, k) - most(nums, k - 1);
    }

    public int most(int[] nums, int k) {
        int l = 0, res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int r = 0; r < nums.length; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while (map.size() > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }
            res += r - l + 1;
        }
        return res;
    }
}