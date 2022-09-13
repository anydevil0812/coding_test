a = []
def solution(phone_book):
    phone_book.sort() # phone_book의 원소들은 int가 아닌 str이라 sort를 하면 유사한 번호들이 서로 앞 순서로 정렬됨 
    for i, j in zip(phone_book, phone_book[1:]):
            if i == j[0:len(i)]:
                a.append(False)          
            else:
                a.append(True)
    if False in a:
        return False
    else:
        return True
