def solution(s):
    li = list(s.lower())
    if li[0].isdigit() == False:
        li[0] = li[0].upper()
    for i in range(1, len(li)):
        if li[i-1] == " " and li[i].isdigit() == False:
            li[i] = li[i].upper()
    answer = "".join(li)
    return answer