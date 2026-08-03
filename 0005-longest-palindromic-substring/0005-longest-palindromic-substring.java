class Solution {
int start=0;
int maxlen=1;

    public void expand(String s, int left, int right){
    while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
left--;
right++;
    }
    int length=right-left-1;
       if (length > maxlen) {
            maxlen = length;
            start = left + 1;
        }
    }

    public String longestPalindrome(String s) {
        if(s==null || s.length()<=1){
        return s;
     }

     for(int i=0;i<s.length();i++){
        //odd length
        expand(s,i,i);

        //even length
        expand(s,i,i+1);
     }
     return s.substring(start,start+maxlen);
    }
}