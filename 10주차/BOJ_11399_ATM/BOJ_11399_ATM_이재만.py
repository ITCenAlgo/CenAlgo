N = int(input())
P = sorted(list(map(int, input().split())))
print(sum([P[i] * (N - i) for i in range(N)]))
