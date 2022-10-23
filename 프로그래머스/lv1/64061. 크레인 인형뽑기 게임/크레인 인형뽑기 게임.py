# [1,5,3,5,1,2,1,4]
def solution(board, moves):
    answer = 0
    basket = []
    for i in moves:
        i -= 1
        for j in range(len(board)):
            if board[j][i] == 0:
                continue
            
            else:
                if (len(basket) == 0) or (len(basket) != 0 and basket[-1] != board[j][i]):
                    basket.append(board[j][i])
                    board[j][i] = 0
                    break
                    
                if len(basket) != 0 and basket[-1] == board[j][i]:
                    board[j][i] = 0
                    basket.pop()
                    answer += 2
                    break
    return answer