def solution(answers):
    answer = []
    a = [1,2,3,4,5] * 2000
    b = [2,1,2,3,2,4,2,5] * 1250
    c = [3,3,1,1,2,2,4,4,5,5] * 1000
    d = []
    e = []
    f = []
    for i in range(len(answers)):
        if a[i] == answers[i]:
          d.append("o")
        if b[i] == answers[i]:
          e.append("o")
        if c[i] == answers[i]:
          f.append("o")
    g = max(len(d),len(e),len(f))
    if len(d) == g:
        answer.append(1)
    if len(e) == g:
        answer.append(2)
    if len(f) == g:
        answer.append(3)
    return answer