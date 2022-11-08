from collections import deque

def solution(maps):
    w, h = len(maps[0]), len(maps)
    dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
    
    graph = [[-1 for i in range(w)] for j in range(h)]

    queue = deque()
    queue.append((0, 0))

    graph[0][0] = 1

    while queue:
        y, x = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < w and 0 <= ny < h and maps[ny][nx] == 1:
                if graph[ny][nx] == -1:
                    graph[ny][nx] = graph[y][x] + 1
                    queue.append((ny, nx))

    answer = graph[-1][-1]
    return answer