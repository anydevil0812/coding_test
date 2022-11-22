from sys import stdin
num = int(stdin.readline())
schedule = [list(map(int, stdin.readline().split())) for _ in range(num)]
d = [0] * (num+1)
for i in range(num-1, -1, -1):
    if i + schedule[i][0] > num:
        d[i] = d[i+1]
    else:
        d[i] = max(d[i+1], schedule[i][1] + d[i+schedule[i][0]])
print(d[0])