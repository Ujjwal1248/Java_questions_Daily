class Solution {
    public String reversePrefix(String word, char ch) {
        int end = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                end = i;
                break;
            }
        }
        String first = reverse(word, 0, end);
        String last = "";
        for(int i = end + 1; i < word.length(); i++){
            last+=word.charAt(i);
        }
        return first + last;
    }
    public String reverse(String word, int start, int end) {
        String s = "";
        for(int i = end; i >= 0; i--){
            s+=word.charAt(i);
        }
        return s;
    }

}