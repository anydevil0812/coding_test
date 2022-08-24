import math
def solution(n):
    a = str(math.sqrt(n)).split('.')
    if int(a[1]) == 0: 
        answer = (int(math.sqrt(n))+1)**2
    else:
        answer = -1
    return answer