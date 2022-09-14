a = []
def solution(phone_book):
    phone_book.sort() # phone_book의 원소들은 int가 아니라 str이기 때문에 sort()를 적용하면 비슷한 번호의 원소들 앞 순서에 정렬됨  
    for i, j in zip(phone_book, phone_book[1:]):
            if i == j[0:len(i)]:
                return False          
    return True
