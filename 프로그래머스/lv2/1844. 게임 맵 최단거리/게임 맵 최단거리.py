from collections import deque

def solution(maps):
    r, c = len(maps), len(maps[0]) # 가로(row), 세로(column)
    dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
    
    graph = [[-1 for i in range(c)] for j in range(r)] # maps 형태 그대로 복사후 모든 값 -1로

    queue = deque()
    queue.append((0, 0))

    graph[0][0] = 1 # 시작 부분은 안지날 수 없으니 1로 설정

    while queue:
        y, x = queue.popleft()
        for i in range(4): # 동서남북 4가지 방향 모두 적용
            nx = x + dx[i]
            ny = y + dy[i]
            
            # maps에서 0인 좌표이면 graph에서는 지날 필요가 없으므로 -1 그대로 두고 
            # maps에서 1인 좌표이고 graph에서는 지나지 않아 -1인 좌표이면 
            # graph에서는 지나야하니 움직이기 전 좌표의 값 + 1
            if 0 <= ny < r and 0 <= nx < c and maps[ny][nx] == 1:
                if graph[ny][nx] == -1: # 2차원 배열에서는 []= y축, [][]=x축
                    graph[ny][nx] = graph[y][x] + 1
                    queue.append((ny, nx))

    return graph[-1][-1]
