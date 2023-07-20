from collections import deque

input()
s = deque(map(int,input().split()))
deq = deque()
i = 1
while s:
    if s[0] == i:
        s.popleft()
        i += 1
    else:
        deq.append(s.popleft())
    while deq and deq[-1] == i:
        deq.pop()
        i += 1
    
print('Sad' if len(deq) else 'Nice')
