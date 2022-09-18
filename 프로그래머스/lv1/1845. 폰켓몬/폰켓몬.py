def solution(nums):
    a = len(nums)/2
    li = list(dict.fromkeys(nums))
    b = len(li)
    if a <= b:
        return a
    else:
        return b