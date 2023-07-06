n = int(input())
s = [int(input()) for i in range(n)]

a = sum([s[i] if i%2 == 0 else -s[i] for i in range(len(s))]) // 2
c = [a, s[0]-a] 

print(c[0])
for i in range(1, len(s)):
    c.append(s[i]-c[i])
    print(c[i])