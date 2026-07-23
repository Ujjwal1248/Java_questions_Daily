class Solution {
    public int maxVowels(String s, int k) {
        int maxV = 0;
        int l = 0, r = 0;
        int currV = 0;
        while(r < s.length()){
            if(s.charAt(r) == 'a' || s.charAt(r) == 'e' ||s.charAt(r) == 'i' ||s.charAt(r) == 'o' ||s.charAt(r) == 'u' ){
                currV++;
            }
            maxV = Math.max(maxV, currV);
            if(r - l+ 1 == k){
                if(s.charAt(l) == 'a' || s.charAt(l) == 'e' ||s.charAt(l) == 'i' ||s.charAt(l) == 'o' ||s.charAt(l) == 'u' ){
                    currV--;
                }
                l++;
            }
            r++;
        }
        return maxV;
    }
}