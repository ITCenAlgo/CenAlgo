n, m = map(int, input().split())

for i in range(1, n+1):
    lst = []
    for j in range(1, m+1):
        lst.append(str((i-1)*m + j))

    print(" ".join(lst))