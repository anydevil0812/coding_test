count = 0

def solution(numbers, target):
    dfs(numbers, target,0,0)
    return count

def dfs(numbers, target, index, sum):
    global count
    if index == len(numbers):
        if sum == target:
            count += 1
        return
    dfs(numbers, target, index+1, sum+numbers[index])
    dfs(numbers, target, index+1, sum-numbers[index])
    return count
