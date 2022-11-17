from sys import stdin
from collections import deque
a = int(stdin.readline())
count = 0
for i in range(a):
    b = stdin.readline()
    queue = deque()
    reverse_queue = deque()
    for j in range(len(b)):
        queue.append(b[j])
        reverse_queue.appendleft(b[j])

    for k in range(len(queue)): #li=[h,a,p,p,y] 2, 4
        first = queue.index(queue[k]) # 0,1 
        last = len(queue) - reverse_queue.index(queue[k])
        repeat = b.count(queue[k])
        if last - first != repeat:
            break
        if k == len(queue)-1:
            count += 1
print(count)