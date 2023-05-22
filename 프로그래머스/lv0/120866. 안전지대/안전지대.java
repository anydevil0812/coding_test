class Solution {
    public int solution(int[][] board) {
        int len = board.length;
        int[][] boomBoard = new int[len][len];
        
        int[] dx = {0, 0, 0 , -1, -1, -1, 1, 1, 1};
        int[] dy = {0, 1, -1, 0, 1, -1, 0, 1, -1};
        
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                for(int k = 0; k < dx.length; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    
                    if (nx >= 0 && nx < len && ny >= 0 && ny < len && board[nx][ny] == 1) {
                        boomBoard[i][j] = 1;
                    }
                }
            }
        }
        int answer = 0;
        for(int[] arr : boomBoard) {
            for(int a : arr) {
                if (a == 0){
                    answer++;
                } 
            }
        }
        return answer;
    }
}