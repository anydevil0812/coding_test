a = input()
li = []
for i in range(len(a)):
    li.append(a[i])
li.sort(reverse=True)

b = ''
for j in range(len(li)):
    b += li[j]
print(b) 