def solution(nums):
    a = len(nums)/2 # 가져갈 수 있는 폰켓몬 수
    li = list(dict.fromkeys(nums)) # 폰켓몬 종류 중복 제거
    b = len(li) # 가져갈 수 있는 폰켓몬의 종류수 
    if a <= b:
        return a
    else:
        return b
