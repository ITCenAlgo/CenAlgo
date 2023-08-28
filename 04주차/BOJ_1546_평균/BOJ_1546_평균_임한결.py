input()
score = list(map(int, input().split()))

print(sum(score) * 100 / (max(score) * len(score)))