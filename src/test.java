import java.util.HashSet;
import java.util.Set;

public class test  {
//    test(int i){}
//    public static void main(String[] args) {
//       child c=new child();
//        System.out.println(c.hashCode());
//    }
//}
//class Parent{
//    Parent(){
//        System.out.println(this.hashCode());
//    }
//}
//class child extends Parent{
//    child(){
//        System.out.println(this.hashCode());
////    }
//    public void methodOne(int ...a){
//        for(int i:a){
//            System.out.println(i);
//        }
//    }

//public static int  mostWaterContainer(int[] arr){
//    int left=0,right=arr.length-1,finalAns=0;
//    while (left<right){
//        int area=right-left;
//        int min=Math.min(arr[left],arr[right]);
//        int ans=area*min;
//        finalAns=Math.max(finalAns,ans);
//        if (arr[left]<arr[right]){
//            left++;
//        }else{
//            right--;
//        }
//    }
//    return finalAns;
//}

static void generate(String str, int index, String curr) {
    if (index == str.length()) {
        System.out.println(curr);
        return;
    }

    // Choice 1: include current char
    generate(str, index + 1, curr + str.charAt(index));

    // Choice 2: skip current char
    generate(str, index + 1, curr);
}
    static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i + 1);

            permute(rest, ans + ch); // <-- recursive call inside loop
        }
    }
    static int maximumSumOfDistinctSubArray(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0;
        int currSum = 0, maxSum = 0;
        Set<Integer> set = new HashSet<>();

        while (j < n) {
            // If duplicate, remove from start until it becomes distinct
            while (set.contains(arr[j])) {
                set.remove(arr[i]);
                currSum -= arr[i];
                i++;
            }

            // Add new element
            set.add(arr[j]);
            currSum += arr[j];

            // If window size exceeds k, shrink it
            if (set.size() > k) {
                set.remove(arr[i]);
                currSum -= arr[i];
                i++;
            }

            // If window size == k, update max
            if (set.size() == k) {
                maxSum = Math.max(maxSum, currSum);
            }

            j++;
        }

        return maxSum;
    }
 static int LargetSubStringWithoutRepeating(String str){
    int j=0,maxSize=0,currSize=0;
    Set<Character>set=new HashSet<>();

    for (int i=0;i<str.length();i++){
        while (set.contains(str.charAt(i))){
            currSize=set.size();
            maxSize=Math.max(maxSize,currSize);
            set.remove(str.charAt(j));
            j++;
        }
        set.add(str.charAt(i));
    }
    if (maxSize==0)return str.length();
    else {
        return maxSize;
    }
 }

    public static void main(String[] args) {
//        int [][]arr=new int[33][3];
//        System.out.println(arr.length);
//        test t=new test();
//        t.methodOne(2,3,4,4,5,6,6);

        // most water container
//        int[]arr={1,8,6,2,5,4,8,3,7};
//        System.out.println(mostWaterContainer(arr));


//    generate("abc",0,"");
//        permute("abc","");

//int[] arr={1,5,4,2,9,9,9,};
//        System.out.println(maximumSumOfDistinctSubArray(arr, 3));

        System.out.println(LargetSubStringWithoutRepeating("abcdeefg"));
}
//
//
}

//}