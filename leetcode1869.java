public class leetcode1869 {
    class Solution {
    public boolean checkZeroOnes(String s) {
        char[] words = s.toCharArray();

        int max1=0;
        int max0 =0;
        int count1 =0;
        int count0 = 0;
        for(int i=0;i<words.length;i++){
            if(words[i]=='1') {count1 ++; count0=0;
            max1=Math.max(count1,max1);
            }
            else{
                count0++;
                count1 =0;
                max0=Math.max(max0,count0);
            }
        }
        return max1>max0;
    }
}
}
