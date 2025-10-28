package backtracking;
public class ratInADeadMaze{
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        int[][] maze={
                {1,0,1},
                {1,1,1},
                {0,1,1}
        };
        printWays(0,0,rows-1,cols-1,"",maze);
    }
    public static void printWays(int sr,int sc,int er,int ec,String str,int[][]maze){
        if (sr>er||sc>ec)return;
        if (sr==er&&sc==ec){
            System.out.println(str);
            return;
        }
        if (maze[sr][sc]==0){
            return;
        }
        printWays(sr+1,sc,er,ec,str+"D",maze);
        printWays(sr,sc+1,er,ec,str+"R",maze);
    }
}
