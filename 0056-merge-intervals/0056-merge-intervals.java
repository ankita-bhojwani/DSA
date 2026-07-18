class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
     
        for(int i=1;i<intervals.length;i++){
               int last[]=res.get(res.size()-1);
          int curr[]=intervals[i];
          if(last[1]>=curr[0]){
            last[1]=Math.max(curr[1],last[1]);
          }
          else{
                res.add(curr);

          }
        }
        return res.toArray(new int[res.size()][]);
    }
}