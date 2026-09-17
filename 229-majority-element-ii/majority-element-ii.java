class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0;i < n; i++){
            if(cnt1 == 0 && ele2!= nums[i]){
                cnt1 = 1;
                ele1 = nums[i];
            }
            else if(cnt2 == 0 && ele1!= nums[i]){
                cnt2 = 1;
                ele2 = nums[i];
            }
            else if(nums[i] == ele1) cnt1++;
            else if(nums[i] == ele2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        int thresh = n/3;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(nums[i] == ele1) cnt1++;
            else if(nums[i]==ele2) cnt2++;
        }
        if(cnt1 > thresh) ans.add(ele1);
        if(cnt2 > thresh) ans.add(ele2);
        return ans;
    }
}