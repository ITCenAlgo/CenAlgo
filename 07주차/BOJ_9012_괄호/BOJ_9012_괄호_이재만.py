for _ in range(int(input())):
    chk = [0]
    [chk.append(chk[-1] + (('(' == c) or -1)) for c in input()]
    print('NO' if -1 in chk or chk[-1] else 'YES')
