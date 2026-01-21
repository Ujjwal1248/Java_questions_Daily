class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor1 = Bitwise(arr1);
        int xor2 = Bitwise(arr2);
        return xor1 & xor2;
    }
    public int Bitwise(int[] arr) {
        int xor = 0;
        for(int v : arr){
            xor^=v;
        }
        return xor;
    }
}