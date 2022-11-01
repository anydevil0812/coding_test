a = int(input())
b = list(map(int, input().split()))
b.sort()
count = 0
for i in range(a):
    count += sum(b[:i+1])
print(count)