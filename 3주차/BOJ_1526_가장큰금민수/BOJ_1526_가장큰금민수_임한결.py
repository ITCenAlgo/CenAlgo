n = input()
while True:
    imsi = list(n)
    for i in imsi:
        if i not in ['4', '7']: #각 자릿수를 모두 검사하여 4,7 이외의 숫자이면 n-1을 한다.
            n = str(int(n) - 1)
            break
    if ''.join(imsi) == n: #n이 1을 안 뺀 상태이면 for문을 끝까지 통과했다는 의미이므로 출력하고 while문 종료.
        print(n)
        break