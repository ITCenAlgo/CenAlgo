import sys
input = sys.stdin.readline


for _ in range(int(input())):
    input()
    answer = 0
    arr = [input() for _ in range(next(map(int, input().split())))]
    answer += sum(map(lambda x: x.count('>o<'), arr))
    arr = list(map(''.join, zip(*arr)))
    answer += sum(map(lambda x: x.count('vo^'), arr))
    print(answer)
