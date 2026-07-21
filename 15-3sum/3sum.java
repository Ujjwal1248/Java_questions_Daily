class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                int left = target - nums[j];
                if (map.containsKey(left)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(left);
                    temp.add(-target);
                    temp.add(nums[j]);
                    set.add(temp);
                }
                map.put(nums[j], j);
            }
        }
        return new ArrayList<>(set);
    }
}