import heapq 
a = []
heapq.heapify(a)
def solution(d, budget):
    b = 0
    heapq.heapify(d)
    for i in range(len(d)):
        if b + d[0] > budget:
            break
        else: 
            b += d[0]
            heapq.heappush(a,b)
            heapq.heappop(d)
    answer = len(a)
    return answer