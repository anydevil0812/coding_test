def solution(elements):
    unique = set()
    sequence = elements * 2
    for i in range(len(elements)):
        for j in range(len(elements)):
            unique.add(sum(sequence[i:i+j+1]))
    answer = len(unique)    
    return answer