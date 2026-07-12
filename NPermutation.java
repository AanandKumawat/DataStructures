import java.util.ArrayList;

public class NPermutation {
    public static void main(String[] args) {
        // N permutations 
        int [] arr={1,2,3};
        int n=arr.length;
       ArrayList<Integer>list=new ArrayList<>();
       ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
       boolean[]visted=new boolean[n];
        permute(arr, list, ans, visted, n);

        System.out.println(ans);
    }
     public static void permute(int []arr,ArrayList<Integer>list,ArrayList<ArrayList<Integer>>ans,boolean[]visted,int n){
           
        if (list.size()==n) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<n;i++){
            if (!visted[i]) {
                visted[i]=true;
                list.add(arr[i]);
                permute(arr, list, ans, visted, n);
                list.remove(list.size()-1);
                visted[i]=false;
            }
        }
     }
}
