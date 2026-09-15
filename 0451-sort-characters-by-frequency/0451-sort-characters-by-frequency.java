class Solution {
  

public int maxFreq1(HashMap<Character, Integer> map, String s){
   
 int maxFreq=0;

        for(char ch :s.toCharArray()){
            if(map.containsKey(ch)){
            int freq=map.get(ch);
            if(freq>maxFreq){
             maxFreq=freq;
            }
       }
        }
     
   return maxFreq;  

}

  public String frequencySort(String s) {
        
        StringBuilder res = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        
       for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
     

while(!map.isEmpty()){
    int maxFreq =maxFreq1(map,s);
    for(char ch :s.toCharArray()){
       if(map.containsKey(ch) && map.get(ch)==maxFreq){
        for(int i=0;i<maxFreq;i++){
            res.append(ch);
        }
         map.remove(ch);
     
       }
    }
         }
         return res.toString();
    }
}