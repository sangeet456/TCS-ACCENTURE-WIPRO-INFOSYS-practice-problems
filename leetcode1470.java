public class leetcode1470 {
    class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size = nums.length;
        int x1[] = new int[size/2];
        int x2[] = new int[size/2];
        int result[] = new int[nums.length];
        for(int i=0;i<size/2;i++){
                x1[i] = nums[i];
                x2[i] = nums[i+size/2];
        }
        for(int i=0;i<nums.length;i++){
           if(i%2==0) result[i]=x1[i/2];
           else result[i]=x2[i/2];
        }
    return result;}
}
}
