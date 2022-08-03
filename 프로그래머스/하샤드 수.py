def solution(x):
    a = 0
    for i in range(len(str(x))):
        a += int(str(x)[i])
        if x % a == 0:
            answer = True
        else:
            answer = False
    return answer