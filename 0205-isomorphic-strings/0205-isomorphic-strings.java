class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
      if(s.length()!=t.length()){
         return false;
      }

      for(int i=0;i<s.length();i++){
if(!map.containsKey(s.charAt(i))){
    if(!map.containsValue(t.charAt(i))){
        map.put(s.charAt(i),t.charAt(i));
    }
    else{
    return false;
    }
}
else{
    char already = map.get(s.charAt(i));
    if(already!=t.charAt(i)){
        return false;
    }
}

      }
      return true;
      
    }
}