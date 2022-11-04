a = int(input())
li = []
for i in range(a):
    b = input()
    if [b, len(b)] in li:
        continue
    li.append([b, len(b)]) 
   
li.sort(key=lambda x:(x[1],x[0]))
for j in range(len(li)):
    print(li[j][0])