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
        return count # count = 한 단지에서의 집의 수

    else:
        return False

block = [] # 단지의 개수 파악을 위해 빈 리스트 생성

for j in range(size):
    for k in range(size):
        if dfs(j, k) > 0:
            block.append(count)
            count = 0 # 한 단지에서의 집의 수 파악 후 다음 단지에서의 집의 수 파악을 위해 count 0으로 초기화

print(len(block)) # 단지 수 출력

block.sort() # 오름차순 출력을 위해 sort

for n in block:
    print(n) # 각 단지에서의 집의 수 출력