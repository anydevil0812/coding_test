import java.util.ArrayList;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> basket = new ArrayList<>();
        for (int i : moves) {
            i--;
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 0) {
                    continue;
                } else {
                    if (basket.isEmpty() || basket.get(basket.size() - 1) != board[j][i]) {
                        basket.add(board[j][i]);
                        board[j][i] = 0;
                        break;
                    }
                    if (!basket.isEmpty() && basket.get(basket.size() - 1) == board[j][i]) {
                        board[j][i] = 0;
                        basket.remove(basket.size() - 1);
                        answer += 2;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
