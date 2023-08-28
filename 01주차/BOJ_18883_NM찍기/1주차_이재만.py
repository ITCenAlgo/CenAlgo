N, M = map(int, input().split())
for i in range(1, N * M + 1, M):
    print(*range(i, i + M))
