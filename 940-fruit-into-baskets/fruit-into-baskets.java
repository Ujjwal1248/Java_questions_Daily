class Solution {
    public int totalFruit(int[] nums) {
        int l = 0, r = 0, n = nums.length;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (r < n) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while (map.size() > 2) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }
            max = Math.max(max, r-l+1);
            r++;
        }
        return max;
    }
}