from collections import Counter
import re
def solution(s):
    s = re.sub('[}{]', '', s)
    element = list(map(int, s.split(',')))
    counter = dict(Counter(element))

    li = sorted(counter.items(), reverse=True, key=lambda x:x[1])
    answer = []
    for i, j in li:
        answer.append(int(i))
    return answer

