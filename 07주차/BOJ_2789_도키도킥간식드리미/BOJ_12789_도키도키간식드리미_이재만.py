N, *order = map(int, open(0).read().split())
stack, i = [], 1

for o in order:
    if o == i: i += 1
    else: stack.append(o)
    while stack and stack[-1] == i:
        i += 1
        stack.pop()

print('Sad' if stack else "Nice")
