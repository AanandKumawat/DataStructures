package backtracking;

public class mazePath {
    public static void main(String[] args) {
        int rows=4;
        int cols=6;
        int total=maze(1,1,rows,cols);
        System.out.println(total);
    }

    private static int maze(int sr, int sc, int rows, int cols) {
        if (sr>rows || sc>cols)return 0;
        if (sr==rows && sc==cols)return 1;
        int downWays=maze(sr+1,sc,rows,cols);
        int rightWays=maze(sr,sc+1,rows,cols);
        return downWays+rightWays;
    }
}
