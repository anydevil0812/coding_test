a = []
def solution(phone_book):
    phone_book.sort()
    for i, j in zip(phone_book, phone_book[1:]):
            if i == j[0:len(i)]:
                return False          
            else:
                a.append(True)
    if True in a:
        return True