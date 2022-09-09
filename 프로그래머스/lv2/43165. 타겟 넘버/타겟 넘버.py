count = 0
def solution(numbers, target):
    dfs(numbers, target, 0, 0)
    return count 

def dfs(numbers, target, index, sum): 
    global count # global로 지정하지 않으면 재귀함수 실행할 때마다 count가 계속 초기값인 0으로 적용됨
    if index == len(numbers): # numbers의 길이만큼 sum에 연산을 해줌
        if sum == target:
            count += 1
        return
    dfs(numbers, target, index+1, sum+numbers[index]) 
    dfs(numbers, target, index+1, sum-numbers[index])
    return count