class Solution {
    public boolean checkInclusion(String s1, String s2) {
      int n=s2.length();
      int k=s1.length();

      if(k>n){
        return false;
      }

int[] s1Count=new int[26];
      for(char c: s1.toCharArray()){
s1Count[c-'a']++;
      }  

      int[] s2Count=new int[26];
      for(int i=0;i<n;i++){
        s2Count[s2.charAt(i)-'a']++;

        if(i>=k){
            s2Count[s2.charAt(i-k)-'a']--;
        }

        if(Arrays.equals(s1Count,s2Count)){
            return true;
        }
      }
      return false;
    }
}