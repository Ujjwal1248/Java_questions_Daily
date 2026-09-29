class Solution {
    public int splitArray(int[] arr, int k) {
       if (k > arr.length) return -1;
        long sum = 0;
        long max = 0;
        for(int num : arr){
            sum += num;
            max = Math.max(max, num);
        }
        long low = max;
        long high = sum;
        while(low <= high){
            long mid = low + (high - low)/2;
            int poss = isPossible(arr, mid);
            if(poss > k) low = mid+1;
            else high = mid - 1;
        }
        return (int)low;
    }
    public int isPossible(int[] arr, long pages){
        int stu = 1, pagesStu = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] + pagesStu <= pages){
                pagesStu += arr[i];
            }
            else{
                stu++;
                pagesStu = arr[i];
            }
        }
        return stu;
    }
}