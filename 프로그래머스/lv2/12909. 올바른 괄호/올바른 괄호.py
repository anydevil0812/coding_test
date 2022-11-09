from collections import deque
def solution(s):
    if len(s) % 2 == 1:
        return False
    
    queue = deque()
    for i in range(len(s)):
        queue.append(s[i])
        
    num = 0    
    for j in range(len(s)):
        a = queue.popleft()
        if a == "(":
            num += 1
        if a == ")":
            num -= 1
        if num < 0:
            return False
    if num > 0:
        return False
    return True