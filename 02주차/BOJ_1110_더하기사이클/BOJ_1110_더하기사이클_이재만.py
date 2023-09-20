N = x = int(input())
answer = 1
while (x := x % 10 * 10 + (x // 10 + x % 10) % 10) != N:
    answer += 1
print(answer)
