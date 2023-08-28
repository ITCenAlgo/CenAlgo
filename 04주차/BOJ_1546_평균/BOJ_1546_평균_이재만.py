N = int(input())
score = list(map(int, input().split()))
print(sum(map(lambda x: x / max(score) * 100, score)) / N)
