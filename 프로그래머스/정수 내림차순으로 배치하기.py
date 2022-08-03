import heapq 
def solution(n):
    a = []
    b = []
    
    for num in str(n) :
        a.append(-int(num))
 
    heapq.heapify(a)
    while len(b) < len(str(n)):
        b.append(-a[0])
        heapq.heappop(a)
   
    answer = ''.join(map(str,b))
    return int(answer)
