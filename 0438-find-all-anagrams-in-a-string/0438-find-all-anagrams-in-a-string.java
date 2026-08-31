class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int n= s.length();
        int k = p.length();

        int[] pCount= new int[26];
        for(char c : p.toCharArray()){
            pCount[c-'a']++;
        }

int[] sCount=new int[26];
for(int i=0;i<n;i++){
        
        sCount[s.charAt(i)-'a']++;
        if(i>=k){
            sCount[s.charAt(i-k)-'a']--;
        }
      
        if(Arrays.equals(pCount,sCount)){
            list.add((i-k)+1);
        }
}
return list;
    }
}