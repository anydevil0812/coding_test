from collections import deque
from math import ceil
def solution(progresses, speeds):

    queue = deque()
    for i in range(len(speeds)):
        a = ceil((100 - progresses[i]) / speeds[i])
        queue.append(a)

    answer = []
    while queue:
        b = queue.popleft()
        count = 1
        for i in list(queue):
            if  b >= i:
                queue.remove(i)
                count += 1
            else:
                break
        answer.append(count)
    return answer