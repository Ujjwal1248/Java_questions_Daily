class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int n = gas.length;
        for(int i =0; i <n;i ++){
            total += gas[i] - cost[i];
        }
        if(total < 0) return -1;
        int idx = 0;
        total = 0;
        for(int i = 0; i < n; i++){
            total += gas[i] - cost[i];
            if(total < 0){
                total = 0;
                idx = i + 1;
            }
        }
        return idx;
    }
}