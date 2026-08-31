class Solution {
int count=0;

    public int expand(String s , int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
    public int countSubstrings(String s) {
        int left=0;
        int right=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.length()<1 || s==null){
                return 0;
            }
            if(s.length()==1){
                return 1;
            }
            //for odd
            expand(s,i,i);

            //for even
            expand(s,i,i+1);
        }
        return count;
    }
}