class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f = 0;
        int t = 0;
        for(int num : bills){
            if(num == 5) f++;
            else if(num == 10){
                if(f <= 0) return false;
                f--;
                t++;
            }
            else{
                if(t >= 1 && f >= 1){
                    t--;
                    f--;
                }
                else if(f >= 3){
                    f -= 3;
                }
                else return false;
            }
        }
        return true;
    }
}