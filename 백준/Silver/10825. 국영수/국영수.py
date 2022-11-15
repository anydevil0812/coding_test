from sys import stdin
a = int(stdin.readline())
li = []
for i in range(a):
    [name, korean, english, math] = stdin.readline().split()
    li.append([name, int(korean), int(english), int(math)])
    
result = sorted(li, key=lambda x : (-x[1], x[2], -x[3], x[0]))

for j in result:
    print(j[0])