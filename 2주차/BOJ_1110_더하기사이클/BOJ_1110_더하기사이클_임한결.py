a = n = int(input()) #35
answer = 1
while (n := (n%10)*10 + (n//10 + n%10)%10) != a:
    answer += 1
print(answer)