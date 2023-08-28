N = int(input())
gms = [4, 7]
i = -1
while gms[i:=i+1] * 10 < 1000000:
    gms.append(gms[i] * 10 + 4)
    gms.append(gms[i] * 10 + 7)

for num in reversed(gms):
    if num <= N:
        print(num)
        break
