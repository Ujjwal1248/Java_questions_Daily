class Solution {
    class Pair{
        int start;
        int end;
        Pair(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public int eraseOverlapIntervals(int[][] nums) {
        int n = nums.length;
        Pair[] pairs = new Pair[n];
        for(int i = 0; i <n; i++){
            pairs[i] = new Pair(nums[i][0], nums[i][1]);
        }
        Arrays.sort(pairs, (a,b) -> a.end - b.end);
        int lastEnd = pairs[0].end;
        int count = 0;
        for(int i = 1; i < n; i++){
            if(pairs[i].start < lastEnd){
                count++;
            }
            else lastEnd = pairs[i].end;
        }
        return count;
    }
}