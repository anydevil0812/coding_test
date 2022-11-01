a = int(input())
li =[]
for i in range(a):
    b, c = list(map(int, input().split()))
    li.append([c, b])

li.sort()
for c, b in li:
    print(b, c)