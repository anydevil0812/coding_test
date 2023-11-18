import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[][] visited = new int[maps.length][maps[0].length];
        visited[0][0] = 1;
        int answer = bfs(maps, visited);
        if(answer != 0){
            return answer;
        } else {
            return -1;
        }
    }
    
    public int bfs(int[][] maps, int[][] visited){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        while(!queue.isEmpty()){
            int[] curr = queue.remove();
            int x = curr[0];
            int y = curr[1];
            
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];    
                if(nx < 0 || nx >= maps.length || ny < 0 || ny >= maps[0].length) continue;
                if(visited[nx][ny] == 0 && maps[nx][ny] == 1){
                    visited[nx][ny] = visited[x][y] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }   
        }
        return visited[maps.length-1][maps[0].length-1];
    }
    
}