class Solution {
    public int nextGreaterElement(int n) {
        String s = Integer.toString(n);
        int[] nums = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            nums[i] = n % 10;
            n /= 10;
        }
        int idx1 = -1;
        int idx2 = -1;
        n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx1 = i;
                break;
            }
        }
        if (idx1 == -1) {
            return -1;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[idx1]) {
                idx2 = i;
                break;
            }
        }
        if (idx2 == -1) {
            return -1;
        }
        swap(nums, idx1, idx2);
        reverse(nums, idx1 + 1);
        long ans = 0;
        for (int digit : nums) {
            ans = ans * 10 + digit;
        }
        long ll = Integer.MAX_VALUE;
        if(ans <= ll && ans > 0) return (int) ans;
        return -1;
    }

    public void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    public void reverse(int[] nums, int s) {
        int e = nums.length - 1;
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}