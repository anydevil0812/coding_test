def solution(n):
    a = []
    b = str(n)
    for i in range(len(b)):
        a.append(int(b[i]))
        answer = sum(a)
    return answer