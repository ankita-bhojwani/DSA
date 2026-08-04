class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] arr= s.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
         char[] arr2= t.toCharArray();
        Arrays.sort(arr2);
        String sorted2 = new String(arr2);

for(int i=0;i<s.length();i++){
    if(sorted.charAt(i)!=sorted2.charAt(i)){
        return false;
    }
}
return true;
        
    }
}