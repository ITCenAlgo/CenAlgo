while (n:= int(input())) != 0:
    l = [input() for i in range(n)] #원본 문자열 리스트
    imsi = [i for i in enumerate(list(map(lambda x: x.lower(), l)))] #모든 알파벳을 소문자로 변환 후, enumerate로 인덱스를 붙여 튜플화함
    imsi.sort(key=lambda x: x[1]) #두 번째 원소를 기준으로 튜플 오름차순 정렬
    print(l[imsi[0][0]]) #가장 첫 번째의 인덱스에 해당하는 값을 출력