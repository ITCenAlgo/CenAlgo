def cnt(l, r):
    if r[0] == '0':
        return 0

    n = len(l)
    dp = [1] + [0] * n
    for i in range(1, n + 1):
        target = l[:i]
        for j in range(len(target), 0, -1):
            cur = target[-j:]
            if len(cur) > len(r) or (len(cur) == len(r) and cur >= r) or (len(cur) > 1 and cur[0] == '0'):
                continue
            dp[i] += dp[len(target) - j]
    return dp[-1]


s = input()
n = len(s)
if s[0] == '0':
    if len(s) > 1 and s[1] > '0':
        print(1)
    else:
        print(0)
    exit()

answer = 0
for i in range(1, n):
    l, r = s[:i], s[i:]
    answer += cnt(l, r)
print(answer)
