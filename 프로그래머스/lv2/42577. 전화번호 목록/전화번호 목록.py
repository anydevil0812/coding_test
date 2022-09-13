a = []
def solution(phone_book):
    phone_book.sort()
    for i, j in zip(phone_book, phone_book[1:]):
            if i == j[0:len(i)]:
                a.append(False)          
            else:
                a.append(True)
    if False in a:
        return False
    else:
        return True