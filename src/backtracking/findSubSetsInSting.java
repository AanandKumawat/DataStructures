package backtracking;

public class findSubSetsInSting {
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        subString(str,ans,0);
    }

    public static void subString(String str,String ans,int index){
        // base case
        if (index==str.length()){
            if (ans.length()==0){
                System.out.println("null");return;
            }else {
                System.out.println(ans);
                return;
            }
        }
        //yes chose
        subString(str,ans+str.charAt(index),index+1);
        // no chose
        subString(str,ans,index+1);
    }
}
