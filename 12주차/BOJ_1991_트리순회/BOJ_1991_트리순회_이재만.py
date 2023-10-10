def trav(p):
    global pre, ino, post
    pre += p
    if tree[p][0] != '.': trav(tree[p][0])
    ino += p
    if tree[p][1] != '.': trav(tree[p][1])
    post += p


tree = {}
for _ in range(int(input())):
    p, r, l = input().split()
    if p not in tree: tree[p] = []
    tree[p].append(r)
    tree[p].append(l)

pre = ino = post = ''
trav('A')
print(pre, ino, post, sep='\n')
