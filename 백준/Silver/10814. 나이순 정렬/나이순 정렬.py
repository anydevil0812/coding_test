a = int(input())
li = []
for i in range(a):
    li.append(list(input().split()))
    li[i][0] = int(li[i][0])
    li[i].append(i)

li.sort(key=lambda x:(x[0],x[2]))
for k in range(len(li)):
    print(li[k][0], li[k][1])