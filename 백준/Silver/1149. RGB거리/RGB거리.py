from sys import stdin
num = int(stdin.readline())
cost = [] 
for i in range(num):
    cost.append(list(map(int, stdin.readline().split())))

for k in range(1, num):
    cost[k][0] += min(cost[k-1][1], cost[k-1][2]) 
    cost[k][1] += min(cost[k-1][0], cost[k-1][2])
    cost[k][2] += min(cost[k-1][0], cost[k-1][1])

answer = min(cost[num-1])
print(answer)