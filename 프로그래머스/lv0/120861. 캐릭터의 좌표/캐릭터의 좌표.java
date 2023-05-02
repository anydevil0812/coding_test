class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0, y = 0;
        int maxX = (board[0] - 1) / 2;
        int minX = (board[0] - 1) / 2 * -1;
        int maxY = (board[1] - 1) / 2;
        int minY = (board[1] - 1) / 2 * -1; 
        for(String i : keyinput){
            if(i.equals("left")){
                x += (x == minX) ? 0 : -1;
            } else if(i.equals("right")){
                x += (x == maxX) ? 0 : 1;
            } else if(i.equals("up")){
                y += (y == maxY) ? 0 : 1;
            } else if(i.equals("down")){
                y += (y == minY) ? 0 : -1;    
            }
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}