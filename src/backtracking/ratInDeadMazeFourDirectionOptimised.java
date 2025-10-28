package backtracking;

public class ratInDeadMazeFourDirectionOptimised {
    public static void main(String[] args) {
        int row=3;
        int col=4;
        int[][]maze={
                {1,0,1,1},
                {1,1,1,1},
                {1,1,0,1},
        };
        print(0,0,row-1,col-1,"",maze);
    }
    private static void print(int sr,int sc,int er,int ec,String str,int[][]maze){
        if (sr<0||sc<0)return;
        if (sc>ec || sr>er)return;
        if (sr==er&&sc==ec){
            System.out.println(str);
            return;
        }
        if (maze[sr][sc]==0)return;
        if (maze[sr][sc]==-1)return;

        maze[sr][sc]=-1;
        // go right
        print(sr,sc+1,er,ec,str+"R",maze);
        //go down
        print(sr+1,sc,er,ec,str+"D",maze);
        //go left
        print(sr,sc-1,er,ec,str+"L",maze);
        //go up
        print(sr-1,sc,er,ec,str+"U",maze);

        //backTracking
        maze[sr][sc]=1;

    }
}
