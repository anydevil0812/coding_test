def solution(n, m):
    answer = []
    a = []
    if m > n:
        n, m = m, n
    for i in range(1,n+1):
        if m % i == 0 and n % i == 0:
            a.append(i)   
    answer.append(max(a))
    answer.insert(1,int(n*m/max(a)))
    return answer