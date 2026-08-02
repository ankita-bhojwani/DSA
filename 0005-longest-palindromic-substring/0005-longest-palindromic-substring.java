class Solution {

    public boolean isPalindrome(String s, int left, int right){
       while(left<right){
if(s.charAt(left)!=s.charAt(right)){
return false;
}
left++;
right--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int max=0;
       String sub="";
       if(s.length()<=1){
        return s;
       }
     for (int i=0; i<s.length()-1;i++){
        for(int j=i;j<s.length();j++){
            if(isPalindrome(s,i,j)){
                if(max<j-i+1){
max=j-i+1;
sub = s.substring(i, j+1);
                }

            }
        }
     }  
     return sub; 
    }
}