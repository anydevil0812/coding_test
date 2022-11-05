from collections import deque
def solution(people, limit):
    count = 0
    li = deque(sorted(people))
    while len(li) > 0:
        if len(li) == 1:
            count += 1
            break
            
        if li[0] + li[-1] <= limit:
            li.popleft()
            li.pop()
            
        else:
            li.pop()
            
        count += 1
    return count