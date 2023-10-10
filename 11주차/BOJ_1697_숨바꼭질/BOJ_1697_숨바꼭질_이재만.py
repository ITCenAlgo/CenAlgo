N, K = map(int, input().split())
Q, i = [N], -1
point = [0] * 100001
point[N] = 1
while Q[(i := i + 1)] != K:
    n = Q[i]
    for x in [n + 1, n -1, n * 2]:
        if 0 <= x < 100001 and not point[x]:
            Q.append(x)
            point[x] = point[n] + 1
print(point[K] - 1)
