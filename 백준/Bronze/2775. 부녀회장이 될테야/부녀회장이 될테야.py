from sys import stdin
num = int(stdin.readline())
for i in range(num):
    floor = int(stdin.readline())
    room = int(stdin.readline())
    zero_floor = [j for j in range(1, room+1)]
    
    for x in range(floor):
        for y in range(1, room):
            zero_floor[y] += zero_floor[y-1]
    
    print(zero_floor[-1])