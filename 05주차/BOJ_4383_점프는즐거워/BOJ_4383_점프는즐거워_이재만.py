for s in open(0).readlines():
    n, *arr = map(int, s.split())
    print('Jolly' if sorted([abs(arr[i] - arr[i + 1]) for i in range(len(arr) - 1)]) == list(range(1, n)) else 'Not jolly')
