def solution(input_string):
    li = [] # 외톨이 알파벳 리스트
    unique = ''.join(dict.fromkeys(input_string)) # 주어진 문자열를 구성하는 알파벳 추출을 위해 중복 제거

    for i in unique:
        num = input_string.index(i) # 해당 알파벳이 처음 나타나는 인덱스 위치
        if num == len(input_string)-1: # 맨 마지막 인덱스는 다음 순서와 비교할 수 없으니(중복되는 알파벳이 없는 경우)
            continue

        count = 0 # 중복되는 알파벳이 연속으로 몇번 등장하는지
        while input_string[num] == input_string[num + 1]: # 문자열에서 해당 알파벳이 연속으로 등장하는지
            count += 1
            num += 1 # 인덱스 기준 한칸씩 이동
            if num == len(input_string)-1: # 맨 마지막 인덱스는 다음 순서와 비교할 수 없으니(중복되는 알파벳이 있는 경우)
                break

        num = input_string.index(i) # 인덱스 번호 초기화
        if input_string.find(i, num + count + 1) != -1: # 뭉쳐있는 알파벳 다다음에 또 동일한 알파벳이 등장하면
            li.append(i) # 외톨이 알파벳 리스트에 추가

    if len(li) == 0: # 외톨이 알파벳 존재 X
        return "N"
    else: # 외톨이 알파벳 존재
        li.sort()  # 알파벳 순서대로 출력해야 하니 오름차순 정렬
        answer = ''.join(li) # 각 알파벳을 하나의 단어로 합체
        return answer