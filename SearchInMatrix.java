public class SearchInMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 6, 12, 27, 32},
                {38, 41, 47, 49, 55},
                {67, 69, 75, 76, 86},
                {87, 89, 91, 95, 99}
        };

        int[] ans = search(matrix, 76);

        for(int i:ans){
           System.out.print(i+" ");
        }
    }

    public static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}