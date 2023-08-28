for i in range(int(input())):
    str = input()
    imsi = []
    for j in str:
        imsi.append(j)
        if len(imsi)>1 and imsi[-2]=='(' and j==')':
            imsi.pop()
            imsi.pop()
    print('NO' if int(len(imsi)) else 'YES')