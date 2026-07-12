import java.util.ArrayList;
import java.util.Arrays;

public class LastIntervals {
    public static void main(String[] args) {
        int[][]intervals={
            {1,3},
            {2,6},
            {8,10},
            {15,18}
        };
         for(int[]ans:intervals(intervals)){
           for(int i:ans){
            System.out.print(i+" ");
           }
         }
    }
    static ArrayList<int[]> intervals(int[][]intervals){
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]>result=new ArrayList<>();
        result.add(intervals[0]);
        
        for(int i=1;i<intervals.length;i++){
            int[]LastInterval=result.get(result.size()-1);
            if (LastInterval[1]>=intervals[i][0]&&LastInterval[1]<intervals[i][1]) {
                LastInterval[1]=intervals[i][1];
            }else if(LastInterval[1]<intervals[i][0]){
                result.add(intervals[i]);
            }
        }
     return result;
    }
}
