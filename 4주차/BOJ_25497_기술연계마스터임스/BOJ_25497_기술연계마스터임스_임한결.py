input()
skills = list(input())

answer = 0
sk_s = []
lr_s = []
for i in skills:
    if i == 'S':
        sk_s.append('S')
    elif i == 'K':
        if len(sk_s) > 0:
            sk_s.pop()
            answer += 1
        else:
            break
    elif i == 'L':
        lr_s.append('L')
    elif i == 'R':
        if len(lr_s) > 0:
            lr_s.pop()
            answer += 1
        else:
            break
    else:
        answer += 1

print(answer)