public class leetcode2000 {
    class Solution {
    public String reversePrefix(String word, char ch) {
        String result ="";
        String temp = "";
  if(word.indexOf(ch) == -1) return word;  
        for(int i=0;i<word.length();i++){
            temp += word.charAt(i);
            if(word.charAt(i)==ch){
                  break;
            }
        }
        for(int i=temp.length()-1;i>=0;i--){
            result+=temp.charAt(i);
        }
        for(int i=temp.length() ; i<word.length();i++){
            result += word.charAt(i);
        }

return result;

        }
}
}
