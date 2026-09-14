class Solution {
    public int removeDuplicates(int[] arr) {
        int i = 1;
        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[j-1]){
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }
}