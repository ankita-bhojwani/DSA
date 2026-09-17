class Solution {
    public int beautySum(String s) {
     
        int result=0;
       for(int i=0;i<s.length();i++){
         HashMap<Character,Integer> map = new HashMap<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
         for(int j=i;j<s.length();j++){
            max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
          for(int values: map.values()){
             max=Math.max(max,values);
             min=Math.min(min,values);
          }
          result+=max-min;
            }
         }
      return result;
       }


    
}