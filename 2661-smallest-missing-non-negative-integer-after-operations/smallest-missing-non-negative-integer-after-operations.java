class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency of each normalized remainder
        for(int num : nums){
            int rem = ((num % value) + value) % value; // normalize negative numbers
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        int mex = 0;
        while(true){
            int rem = mex % value; // remainder group of current mex
            if(map.containsKey(rem)){
                map.put(rem, map.get(rem) - 1); // use one number from this remainder group
                if(map.get(rem) == 0) map.remove(rem); // remove if exhausted
                mex++; // move to next number
            }else{
                break; // remainder group empty → mex found
            }
        }

        return mex;
    }
}