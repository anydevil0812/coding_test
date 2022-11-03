from bisect import bisect_left, bisect_right
a = int(input())
b = list(map(int, input().split(" ")))
c = int(input())
d = list(map(int, input().split(" ")))

b.sort()

for i in range(c):
    if bisect_right(b, d[i])-bisect_left(b, d[i])>0:
        print(1)
    else:
        print(0)