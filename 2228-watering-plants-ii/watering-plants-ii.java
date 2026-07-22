class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int a = 0, n = plants.length, b = n-1;
        int totalA = capacityA, totalB = capacityB;
        int refill = 0;
        while(a <= b){
            if(a==b){
                if(capacityA < plants[a] && capacityB < plants[b]){
                    refill++;
                }
                break;
            }
            if(capacityA < plants[a]){
                capacityA = totalA;
                refill++;
            }
            if(capacityB < plants[b]) {
                capacityB = totalB;
                refill++;
            }
            capacityA -= plants[a];
            a++;
            capacityB -= plants[b];
            b--;
        }
        return refill;
    }
}