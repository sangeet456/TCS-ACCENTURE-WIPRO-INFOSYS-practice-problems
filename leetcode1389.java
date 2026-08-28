public class leetcode1389 {
   class Solution {


    private static void solve(int target[], int val , int index){
        for(int i=target.length-1;i>index;i--){
            target[i]=target[i-1];
        }
        target[index]= val;
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        
        int target[] = new int[nums.length];
        for(int i=0;i<target.length;i++){
            solve(target,nums[i], index[i]);
        }
    return target;}
} 
}
