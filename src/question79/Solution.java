package question79;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/9 13:14
 * @Created by mmz
 */
public class Solution {

        public static boolean exist(char[][] board, String word) {
            int xlength = board.length;
            int ylength = board[0].length;
            boolean flag = false;
            for(int i = 0;i<xlength;++i){
                for(int j = 0;j<ylength;++j){
                    flag = Core(word,board,i,j,0);
                }
            }
            return flag;
        }

        public static boolean Core(String word,char[][] board,int i ,int j,int index){
            if(index == word.length()){
                return true;
            }
            if(i<0 || i>=board.length || j<0 || j>=board[0].length){
                return false;
            }
            if(word.charAt(index) == board[i][j]){
                if(Core(word,board,i-1,j,index+1) || Core(word,board,i+1,j,index+1) || Core(word,board,i,j+1,index+1) || Core(word,board,i,j-1,index+1)){
                    return true;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        exist(board,"AB");
    }
}
