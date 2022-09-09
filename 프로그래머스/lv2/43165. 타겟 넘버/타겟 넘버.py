count = 0

def solution(numbers, target):
    dfs(numbers, target,0,0)
    return count

def dfs(numbers, target, index, sum):
    global count # global을 하지 않고 count를 함수의 원소 중 하나로 적용하면 재귀함수를 실행할때마다 count가 초기값인 0으로만 적용됨
    if index == len(numbers): # sum에 numbers의 원소의 개수만큼 연산을 진행하겠다는 의미 
        if sum == target:
            count += 1
        return
    dfs(numbers, target, index+1, sum+numbers[index])
    dfs(numbers, target, index+1, sum-numbers[index])
    return count
