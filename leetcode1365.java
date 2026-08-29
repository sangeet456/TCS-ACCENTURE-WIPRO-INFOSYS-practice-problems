public class leetcode1365 {
    class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    int n= nums.length;
    int result[] = new int[n];
    for(int i=0;i<n;i++){
        int smallercount=0;
        for(int j=0;j<nums.length;j++){
            if(i!=j && nums[j]<nums[i]){
                smallercount++;
            }
        }
        result[i] = smallercount;
    }
    return result;
    }
}
}
