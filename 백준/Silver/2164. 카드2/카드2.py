from collections import deque
a = int(input())
li = deque()
for i in range(1, a+1):
    li.append(i)
while len(li) > 1:
    li.popleft()
    li.append(li.popleft())
print(list(li)[0])