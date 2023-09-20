n = int(input())
s = [input() for i in range(n)]
for i in range(1, len(s[0])+1):
    if n == len(set([s[j][-i:] for j in range(n)])):
        print(i)
        break