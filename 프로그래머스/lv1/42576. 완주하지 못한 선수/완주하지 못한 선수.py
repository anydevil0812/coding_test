def solution(participant, completion):    
    a = {}
    hashsum = 0
    for i in participant:
        a[hash(i)] = i
        hashsum += hash(i)
    for j in completion:
        hashsum -= hash(j)
    return a[hashsum]   