package question79_单词搜索;

/**
 * @Classname Mmz
 * @Description TODO
 * @Date 2020/8/2 23:48
 * @Created by mmz
 */
public class Mmz {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        Boolean[][] flag =new Boolean[row][col];
        for(int i = 0 ;i<row;++i){
            for(int j = 0;j<col;++j) {
                flag[i][j] = false;
            }
        }
        for(int i = 0 ;i<row;++i){
            for(int j = 0;j<col;++j){

                if(Core(board,word,0,flag,row,col,i,j)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean Core(char[][] board,String word,int index,Boolean[][] flag,int row,int col,int rows,int cols){
        if(index == word.length()){
            return true;
        }
        boolean result = false;
        if(rows >=0 && rows< row && cols >=0 && cols<col && flag[rows][cols] == false && board[rows][cols] ==word.charAt(index)){
            flag[rows][cols] = true;
            result = Core(board,word,index+1,flag,row,col,rows+1,cols)||
                    Core(board,word,index+1,flag,row,col,rows-1,cols)||
                    Core(board,word,index+1,flag,row,col,rows,cols+1)||
                    Core(board,word,index+1,flag,row,col,rows,cols-1);
            flag[rows][cols] =false;
            return result;
        }
        return result;
    }

    public static void main(String[] args) {
        Mmz mmz =new Mmz();
        char[][] chars = new char[][]{{'a','b','t','g'},{'c','f','c','s'},{'j','d','e','h'}};
        String string = "bfce";
        System.out.println(mmz.exist(chars, string));
    }
}
