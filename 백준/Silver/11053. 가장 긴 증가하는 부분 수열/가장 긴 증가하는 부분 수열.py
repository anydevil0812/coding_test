from sys import stdin
num = int(stdin.readline())
li = list(map(int, stdin.readline().split()))
d = [0]*(num)
for i in range(num):
    for j in range(i):
        if li[i] > li[j] and d[i] < d[j]:
            d[i] = d[j]
    d[i] += 1
print(max(d))  