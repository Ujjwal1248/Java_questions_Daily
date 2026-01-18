class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0, maxLength = 0, maxf = 0;
        int[] arr = new int[26];
        while (r < s.length()) {
            arr[s.charAt(r) - 'A']++;
            maxf = Math.max(maxf, arr[s.charAt(r)-'A']);
            while((r-l+1) - maxf > k){
                arr[s.charAt(l) - 'A']--;
                maxf = 0;
                for(int i = 0; i< 26; i++){
                    maxf = Math.max(maxf, arr[i]);
                }
                l++;
            }
            if((r-l+1) - maxf <=k){
                maxLength = Math.max(maxLength, r-l+1);
            }
            r++;
        }
        return maxLength;
    }
}