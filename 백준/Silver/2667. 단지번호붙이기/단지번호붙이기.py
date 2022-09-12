size = int(input())
graph = []
count = 0

for i in range(size):
    graph.append(list(map(int, input())))

def dfs(x, y):
    global count

    if x < 0 or x >= size or y < 0 or y >= size:
        return False

    if graph[x][y] == 1:
        graph[x][y] = 'visited'
        count += 1
        dfs(x+1, y)
        dfs(x-1, y)
        dfs(x, y+1)
        dfs(x, y-1)
        return count

    else:
        return False

block = []

for j in range(size):
    for k in range(size):
        if dfs(j, k) > 0:
            block.append(count)
            count = 0

print(len(block))

block.sort()

for n in block:
    print(n)