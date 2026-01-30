package backtracking;

public class nQueens {
    public static boolean isSafe(char[][]board,int row,int col){
        // vertically up
        for (int i=row-1;i>=0;i--){
            if (board[i][col]=='Q') {
                return false;
            }
        }
        // diag left-up
          for (int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
              if (board[i][j]=='Q'){
                  return false;
              }
          }
        // diag right-up
        for (int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if (board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
    static void nQueenss(char[][] board,int rows){
        // base case
        if (rows==board.length){
            printBoard(board);
            return;
        }
        for (int j=0;j<board.length;j++){
            if (isSafe(board,rows,j)){
                board[rows][j]='Q';
                nQueenss(board,rows+1);//function call
                board[rows][j]='x';//backtracking
            }

        }
    }
    public static void printBoard(char[][] board){
        System.out.println("--------------");
        for (int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nQueenss(board,0);
    }
}
