from sys import stdin
from bisect import bisect_left, bisect_right
num = stdin.readline()
standard = list(map(int, stdin.readline().split()))
standard.sort()

num2 = stdin.readline()
card_list = list(map(int, stdin.readline().split()))

for i in card_list:
    if bisect_right(standard, i) - bisect_left(standard, i) == 1:
        print(1)
    else:
        print(0)