t = int(input())

for i in range(t):
    input() #개행
    answer = 0
    r, c = list(map(int, input().split()))
    box = []
    for j in range(r):
        box.append(input())
        answer += box[j].count('>o<') #입력과 함께 가로 사탕의 갯수를 더한다.

    #세로 사탕 갯수 구하기
    for j in range(1, r-1): #첫째 줄과 마지막 줄에 알맹이가 있을 수는 없으므로 제외
        for k in range(c):
            if box[j][k] == 'o' and box[j-1][k] == 'v' and box[j+1][k] == '^':
                answer += 1
    
    print(answer)
