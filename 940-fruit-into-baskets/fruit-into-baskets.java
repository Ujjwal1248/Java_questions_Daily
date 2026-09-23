class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 0, maxC = 0;
        while (r < nums.length) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while (map.size() > 2) {
                map.put(nums[l], map.getOrDefault(nums[l], 1) - 1);
                if (map.get(nums[l]) <= 0)
                    map.remove(nums[l]);
                l++;
            }
            maxC = Math.max(maxC, r - l + 1);
            r++;
        }
        return maxC;
    }
}