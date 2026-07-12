public class SearchInMatrixByBS {
    public static void main(String[] args) {
     int[][] matrix = {
                {1, 6, 12, 27, 32},
                {38, 41, 47, 49, 55},
                {67, 69, 75, 76, 86},
                {84, 89, 91, 95, 99}
        };
       int[]ans=binarySearch(matrix,47);
       for(int i:ans){
        System.out.print(i+" ");
       }

    }
 static int[] binarySearch(int[][]matrix,int target){
      int top=0;int left=0;int bottom=matrix.length-1;int right=matrix[0].length-1;

      while (top<=bottom) {
        int mid=top+(bottom-top)/2;
            if (matrix[mid][0]>target) {
                 bottom=mid-1;
            }else if(matrix[mid][right]<target){top=mid+1;}
            else{

                while (left<=right) {
                    int middle=left+(right-left)/2;
                    if (matrix[mid][middle]==target) {
                        return new int[]{mid,middle};
                    }else if(matrix[mid][middle]>target)right=middle-1;
                    else{left=middle+1;}
                }
            }
            break;
      }
      return new int[]{-1,-1};
 }
}
