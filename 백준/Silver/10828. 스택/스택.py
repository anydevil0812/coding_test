from sys import stdin
a = int(stdin.readline())
answer = []
stack = []
for i in range(a):
    b = stdin.readline().split()

    if b[0] == "push":
        stack.append(b[1])

    elif b[0] == "pop":
        if len(stack) == 0:
            answer.append(-1) 
        else:
            answer.append(stack.pop())
    
    elif b[0] == "size":
        answer.append(len(stack))

    elif b[0] == "empty":
        if len(stack) == 0:
            answer.append(1) 
        else:
            answer.append(0)

    elif b[0] == "top":
        if len(stack) == 0:
            answer.append(-1) 
        else:
            answer.append(stack[-1])
for j in answer:
    print(j)