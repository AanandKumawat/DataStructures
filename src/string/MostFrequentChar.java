package string;

import sun.misc.SoftCache;
import sun.text.normalizer.UCharacter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentChar {
    static void byMap(String str){

        Map<Character,Integer>map=new HashMap<>();
        for (int i=0;i<str.length();i++){
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else {
                map.put(str.charAt(i),1);
            }
        }
        int max=Integer.MIN_VALUE;
        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            max=Math.max(entry.getValue(),max);

        }
        System.out.println(max);
        Character foundKey=null;
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                foundKey = entry.getKey();
                break; // stop at first match
            }
        }
        System.out.println(foundKey);
    } // =-==== plz once clear and rewirte and read this code

    // by sliding window technique
    public static void bySliding(String str){
        char[] chArr=str.toCharArray();
        Arrays.sort(chArr);
        str=new String(chArr);
        int n=str.length();
        int maxFreq=-1;
        char ans=str.charAt(0);
        int i=0,j=0;
        while (j<n){
            if (str.charAt(i)==str.charAt(j)) j++;
            else {
                int length=j-i;
                if (length>maxFreq){
                    maxFreq=length;
                    ans=str.charAt(i);
                }
                i=j;
            }
        }
        int length=j-i;
        if (length>maxFreq){
            maxFreq=length;
            ans=str.charAt(i);
        }
        System.out.println(ans);

    }

    //by frequency array
    public static void byFrequencyArr(String s){
        char[] ch=new char[26];
        int maxFreq=-1;
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int indx=c-97;
            ch[indx]++;
        }
        char ans=s.charAt(0);
        for (int i=0;i<ch.length;i++){
              int freq=ch[i];
              if (freq>maxFreq){
                  maxFreq=freq;
                  ans= (char) (i+97);
              }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
      bySliding("hhhharekrishna");
      byFrequencyArr("hhhharekrishna");
    }
}
