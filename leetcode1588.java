public class leetcode1588 {
 class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalsum=0;
        for(int start=0;start<arr.length;start++)
        {
            for(int end = start ; end<arr.length;end++){
                int length = end - start +1;
                if(length %2!=0){
                    int subarraysum =0;
                    for(int k = start ; k<=end ; k++){
                        subarraysum += arr[k];
                    }
                    totalsum += subarraysum;
                }
            }
        }
   return totalsum;}
}   
}
