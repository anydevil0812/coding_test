def solution(numbers):
    if max(numbers) == 0:
        return "0"
    li = []
    for i in range(len(numbers)):
        b = (str(numbers[i]) * 4)[:4]
        c = len(str(numbers[i]))
        li.append((b,c))
    li.sort(reverse=True) 
    answer = ''
    for j, k in li:
        answer += j[:k]
    return answer