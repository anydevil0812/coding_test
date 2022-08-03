import heapq 
def solution(n):
    a = []
    b = []
    
    for i in range(len(str(n))):
        a.append(str(n)[i])
        a[i] = int(a[i])
        a[i] = -a[i]
    heapq.heapify(a)
    while len(b) < len(str(n)):
        b.append(a[0])
        heapq.heappop(a)
    for i in range(len(b)):
        b[i] = -b[i]
        b[i] = str(b[i])
    answer = ''
    for i in range(len(b)):
        answer = answer + b[i]
    answer = int(answer)
    return answer