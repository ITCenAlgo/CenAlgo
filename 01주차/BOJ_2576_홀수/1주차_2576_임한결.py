lst = [int(input()) for i in range(7)]
hol = []

for i in lst:
    if i%2==1:
        hol.append(i)

if len(hol) == 0:
    print(-1)
else:
    print(sum(hol))
    print(min(hol))