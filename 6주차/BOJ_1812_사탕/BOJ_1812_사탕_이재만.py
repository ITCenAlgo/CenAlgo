N, *candy = map(int, open(0))
sum1 = sum(candy) // 2
sum2 = sum([candy[i] for i in range(0, N, 2)])
answer = [sum2 - sum1]
for i in range(N - 1):
    answer.append(candy[i] - answer[i])
print(*answer, sep='\n')
