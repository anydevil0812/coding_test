from bisect import bisect_left
def solution(citations):
    num = len(citations)
    if min(citations) > num:
        return num
    citations.sort()
    
    count = 0
    for i in range(num):
        small = bisect_left(citations, i)
        if small <= i and i <= num-small:
            answer = max(i, small)
    return answer