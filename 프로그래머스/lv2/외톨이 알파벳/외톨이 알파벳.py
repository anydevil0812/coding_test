def solution(input_string):
    li = []
    unique = ''.join(dict.fromkeys(input_string))

    for i in unique:
        num = input_string.index(i)
        if num == len(input_string)-1:
            continue

        count = 0
        while input_string[num] == input_string[num + 1]:
            count += 1
            num += 1
            if num == len(input_string)-1:
                break

        num = input_string.index(i)
        if input_string.find(i, num + count + 1) != -1:
            li.append(i)

    if len(li) == 0:
        return "N"
    else:
        li.sort()
        answer = ''.join(li)
        return answer