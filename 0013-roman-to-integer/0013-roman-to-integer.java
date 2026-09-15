class Solution {
    public int romanToInt(String s) {
        int I =1,V=5,X=10,L=50,C=100,D = 500,M =1000;
        int res=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int curr= values(ch);
            if(i+1<s.length()){
              int next = values(s.charAt(i+1));
              if(curr>=next){
                res+=curr;
              } 
              else{
                res+=next-curr;
                i++;
              }
            }
            else{
                res+=values(s.charAt(i));
            }
           
        }
        return res;
    }

 public int values(char ch){
if(ch=='I') return 1;
 if(ch == 'V') return 5;
if(ch == 'X') return 10;
 if(ch == 'L') return 50;
   if(ch == 'C') return 100;
  if(ch == 'D') return 500;
    return 1000;
 }
}