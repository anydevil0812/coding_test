def solution(numbers):
    if sum(numbers) == 0:
        return "0"
    
    li = []
    for i in range(len(numbers)):
        a = (str(numbers[i]) * 4)[:4]
        b = len(str(numbers[i]))
        li.append((a,b))
        
    li.sort(reverse=True) 
    answer = ''
    for a, b in li:
        answer += a[:b]
    return answer