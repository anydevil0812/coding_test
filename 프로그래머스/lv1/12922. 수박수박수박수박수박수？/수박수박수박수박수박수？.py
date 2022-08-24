def solution(n):
    a = '수박'
    if n % 2 == 0:
       return a * int(n/2)
    else: 
       return (a * int((n+1)/2))[:n]
