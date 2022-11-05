def solution(s):
    answer = []
    zero_count, cal_count = 0, 0
    while len(s) > 1:
        zero_count += s.count('0')
        s = bin(s.count('1'))[2:]
        cal_count += 1

    answer.append(cal_count)
    answer.append(zero_count)
    return answer 
