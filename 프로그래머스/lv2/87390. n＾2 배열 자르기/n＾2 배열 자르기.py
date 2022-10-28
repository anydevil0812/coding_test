from math import ceil
def solution(n, left, right):
    answer = []
    for i in range(left+1, right+2):
        if i % n == 0:
            answer.append(n)
            continue
        if i % n < ceil(i/n):
            i = ceil(i/n)

        else:
            i = i%n
        answer.append(i) 
    return answer