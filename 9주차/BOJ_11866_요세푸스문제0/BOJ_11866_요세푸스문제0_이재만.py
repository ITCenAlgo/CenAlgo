from collections import deque


N, K = map(int, input().split())
arr = deque(range(1, N + 1))
answer = []
while arr:
    arr.rotate(1 - K)
    answer.append(str(arr.popleft()))
print(f'<{", ".join(answer)}>')
