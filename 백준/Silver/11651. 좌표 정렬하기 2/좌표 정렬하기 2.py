# 방법 1
a = int(input())
li =[]
for i in range(a):
    li.append(list(map(int, input().split())))

li.sort(key=lambda x:(x[1],x[0]))
for j in range(len(li)):
    print(li[j][0], li[j][1])
    
# 방법 2
a = int(input())
li =[]
for i in range(a):
    b, c = list(map(int, input().split()))
    li.append([c, b])

li.sort()
for c, b in li:
    print(b, c)
