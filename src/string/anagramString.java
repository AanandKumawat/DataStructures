package string;

import java.util.Arrays;

public class anagramString {
    public static boolean isAnagram(String s1,String s2){
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
            s1=new String(ch1);
            s2=new String(ch2);
//        String sortedS1=new String(ch1);
//        String sortedS2=new String(ch2);
//        return sortedS1.equals(sortedS2);

        return s1.equals(s2);



    }
    public static void main(String[] args) {

        System.out.println(isAnagram("listen","silent"));
    }
}
