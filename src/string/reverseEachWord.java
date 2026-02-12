package string;

import java.util.Arrays;

public class reverseEachWord {
    public static void wayOne(String str){
        StringBuilder sb=new StringBuilder("");

        String substr;
        int i = 0;
        while (i < str.length()) {
            // find the end of the word
            int j = i;
            while (j < str.length() && str.charAt(j) != ' ') {
                j++;
            }
            substr=str.substring(i,j);
            char[] arr=substr.toCharArray();
            int k=0,l=arr.length-1;
            while (k<=l){
                char temp=arr[k];
                arr[k]=arr[l];
                arr[l]=temp;
                k++;
                l--;
            }
            sb.append(new String(arr));
            if (j < str.length()) sb.append(' ');

            // move to next word
            i = j + 1;
        }
        System.out.println(sb);
    }
    public static void wayTwo(String str){
        String[] arr=str.split(" ");
        StringBuilder result=new StringBuilder();

        for (String word:arr){
            StringBuilder sb=new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str="ridhi meri behan he";
        wayTwo(str);
    }
}
