class Solution {
    public String minWindow(String s, String t) {
        int[] freqs = new int[256];
        int[] freqt = new int[256];
        for (int i = 0; i < t.length(); i++) {
            freqt[t.charAt(i)]++;
        }
        int si = 0, ei = 0, count = 0, size = Integer.MAX_VALUE, start_Index = -1;
        while (ei < s.length()) {
            //Grow
            char ch = s.charAt(ei);
            freqs[ch]++;
            if (freqs[ch] <= freqt[ch]) {
                count++;
            }

            //Shrink
            while (count == t.length() && freqs[s.charAt(si)] > freqt[s.charAt(si)]) {
                freqs[s.charAt(si)]--;
                si++;
            }

            //Update ans
            if(count == t.length() && size > ei - si +1){
                size = ei - si +1;
                start_Index = si;
            }
            ei++;
        }
        if(start_Index == -1) return "";
        return s.substring(start_Index, start_Index + size);
    }
}