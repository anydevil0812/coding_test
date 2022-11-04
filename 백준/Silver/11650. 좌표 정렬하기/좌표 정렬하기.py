a = int(input())
li = []
for i in range(a):
    li.append(list(map(int, input().split(" "))))
    
li.sort(key=lambda x:(x[0],x[1]))
for j in range(len(li)):
    print(li[j][0], li[j][1])