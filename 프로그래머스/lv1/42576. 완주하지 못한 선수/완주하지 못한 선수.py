def solution(participant, completion):    
    a = {}
    hashsum = 0
    for i in participant:
        a[hash(i)] = i # 선수 이름을 value로 가지는 hash값을 key로 지정
        hashsum += hash(i) # 모든 해쉬값 합치기
    for j in completion: # 합쳐진 해쉬값에서 완주에 성공한 선수들의 해쉬값 제거
        hashsum -= hash(j)
    return a[hashsum]  # 결국 남은 해쉬값은 완주하지 못한 선수에 대한 해쉬값이므로 이를 이용하여 선수 이름 반환