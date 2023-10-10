from collections import deque

N, M = map(int, input().split())
loca = [0] * 100001

q = deque()
q.append(N)
while q:
    k = q.popleft()
    if k == M:
        print(loca[M])
        break
    for i in (k-1, k+1, k*2):
        if 0<=i<=100000 and loca[i] == 0:
            loca[i] = loca[k] + 1
            q.append(i)