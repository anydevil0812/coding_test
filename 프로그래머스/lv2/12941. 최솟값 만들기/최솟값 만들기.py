from heapq import heapify, heappop
def solution(A,B):
    answer = 0
    heapify(A)
    for i in range(len(B)):
        B[i] *= -1
    heapify(B)
    for i in range(len(A)):
        answer += heappop(A)*heappop(B)
    return -answer