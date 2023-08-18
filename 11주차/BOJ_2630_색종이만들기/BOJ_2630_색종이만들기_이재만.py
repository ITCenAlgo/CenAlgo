def check(r1, r2, c1, c2, ref):
    for r in range(r1, r2):
        for c in range(c1, c2):
            if arr[r][c] != ref: return 0
    return 1


def DC(r1, r2, c1, c2):
    if check(r1, r2, c1, c2, arr[r1][c1]):
        return 100000 - 99999 * arr[r1][c1]
    return DC(r1, (r1 + r2) // 2, c1, (c1 + c2) // 2) + DC((r1 + r2) // 2, r2, c1, (c1 + c2) // 2) + DC(r1, (r1 + r2) // 2, (c1 + c2) // 2, c2) + DC((r1 + r2) // 2, r2, (c1 + c2) // 2, c2)


N = int(input())
arr = [list(map(int, input().split())) for _ in range(N)]
print(*divmod(DC(0, N, 0, N), 100000), sep='\n')
