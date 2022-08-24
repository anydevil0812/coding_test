def solution(s):
    a = 0
    b = 0
    for i in range(len(s)):
        if s[i].lower() == 'p': 
            a += 1
        elif s[i].lower() == 'y':
            b += 1
    if a == b:
        return True
    else:
        return False