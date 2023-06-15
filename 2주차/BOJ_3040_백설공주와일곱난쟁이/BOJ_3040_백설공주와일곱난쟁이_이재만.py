from itertools import combinations


num = [int(input()) for _ in range(9)]
for selected in combinations(num, 7):
    if sum(selected) == 100:
        print(*selected, sep='\n')
        break
