package HashSet;

import java.util.HashSet;
import java.util.Set;

public class longestUniqueSubString {
    public  static int longestUniqueSubstring(String s) {
         int maxLength=0;
        Set<Character>set=new HashSet<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (!set.contains(ch)){
                set.add(ch);
//                maxLength=Math.max(maxLength,set.size());
            }else {
                maxLength=set.size();
                set.clear();
                set.add(ch);
            }
        }
        return maxLength;

    }
    public static void main(String[] args) {

        System.out.println(longestUniqueSubstring("geeksforgeeks"));
    }
}
