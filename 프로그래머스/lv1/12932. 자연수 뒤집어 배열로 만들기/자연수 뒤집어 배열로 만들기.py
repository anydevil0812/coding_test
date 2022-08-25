def solution(n):
    a = []
    for i in range(len(str(n))):
        a.append(str(n)[::-1][i])
        a[i] = int(a[i])
    return a
        