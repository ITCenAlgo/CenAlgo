n = [int(input()) for i in range(9)]
bad = sum(n) - 100

for i in range(8):
    for j in range(i+1, 9):
        if (n[i]+n[j]) == bad:
            n.remove(n[j])
            n.remove(n[i])
            break
    if len(n) == 7:
        break

for k in range(7):
    print(n[k])