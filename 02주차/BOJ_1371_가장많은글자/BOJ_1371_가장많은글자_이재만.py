from collections import Counter


s = ''.join(open(0).read().split())
cnt = Counter(s)
cnt = sorted(list(filter(lambda x: cnt[x] == max(cnt.values()), cnt)))
print(''.join(cnt))
