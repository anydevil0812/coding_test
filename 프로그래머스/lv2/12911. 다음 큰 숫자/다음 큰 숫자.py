def solution(n):
    a = int(bin(n)[2:])
    b = n+1
    while str(a).count('1') != str(bin(b)[2:]).count('1'):
        b += 1
    return b