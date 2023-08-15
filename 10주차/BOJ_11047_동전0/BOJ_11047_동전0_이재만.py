N, K = map(int,input().split())
coin = [int(input()) for _ in range(N)]
coin.reverse()
answer = 0
for c in coin:
    answer += K // c
    K %= c
print(answer)
