from collections import deque

def solution(maps):
    r, c = len(maps), len(maps[0]) 
    dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
    
    graph = [[-1 for i in range(c)] for j in range(r)]

    queue = deque()
    queue.append((0, 0))

    graph[0][0] = 1

    while queue:
        y, x = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= ny < r and 0 <= nx < c and maps[ny][nx] == 1:
                if graph[ny][nx] == -1:
                    graph[ny][nx] = graph[y][x] + 1
                    queue.append((ny, nx))

    return graph[-1][-1]