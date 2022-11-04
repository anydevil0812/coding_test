import sys
from heapq import heapify, heappop, heappush
a = int(sys.stdin.readline())
li = []
heapify(li)
for i in range(a):
    heappush(li, int(sys.stdin.readline()))

for j in range(len(li)):
    print(heappop(li))