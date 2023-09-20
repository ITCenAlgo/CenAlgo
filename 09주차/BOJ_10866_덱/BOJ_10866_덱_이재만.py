from collections import deque
import sys
input = sys.stdin.readline


N = int(input())
Q = deque()
com = {'push_back': Q.append, 'push_front': Q.appendleft, 'pop_front': lambda: print(Q.popleft() if Q else -1), 'pop_back': lambda: print(Q.pop() if Q else -1),
       'size': lambda: print(len(Q)), 'empty': lambda: print(0 if len(Q) else 1), 'front': lambda: print(Q[0] if Q else -1), 'back': lambda: print(Q[-1] if Q else -1)}

for _ in range(N):
    c = input().split()
    if len(c) > 1:
        com[c[0]](c[1])
    else:
        com[c[0]]()
