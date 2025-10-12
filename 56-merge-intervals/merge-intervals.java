class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<2){
            return intervals;
        }

Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]>result = new ArrayList<>();
        result.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int [] currentinterval=intervals[i];
            int[] lastinterval=result.get(result.size()-1);
            if(currentinterval[0]<=lastinterval[1]){
                lastinterval[1]=Math.max(lastinterval[1],currentinterval[1]);
            } else{
                result.add(currentinterval);
            }

        }
        return result.toArray(new int[result.size()][]);





        
    }
}