input()
skill = input()
LS = {'L': 0, 'S': 0}
answer = 0
for s in skill:
    if s.isnumeric():
        answer += 1
    elif s in LS:
        LS[s] += 1
    elif s == 'R' and LS['L']:
        LS['L'] -= 1
        answer += 1
    elif s == 'K' and LS['S']:
        LS['S'] -= 1
        answer += 1
    else:
        break
print(answer)
