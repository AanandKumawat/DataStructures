package backtracking;

//import static backtracking.mazePath.maze;
//
public class printPath {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        printPath(1,1,rows,cols,"");

    }
    public static void printPath(int sr,int sc,int er,int ec,String str){
        if (sr>er || sc>ec)return;
        if (sr==er&&sc==ec) {
            System.out.println(str);
            return;
        }
        // go down
        printPath(sr+1,sc,er,ec,str+"D");
        // go right
        printPath(sr,sc+1,er,ec,str+"R");
    }

}
