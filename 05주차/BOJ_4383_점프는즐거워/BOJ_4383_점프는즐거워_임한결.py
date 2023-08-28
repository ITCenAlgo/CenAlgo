while True:
  try:
    n = list(map(int, input().split()))
    print('Jolly') if sorted([abs(n[i]-n[i-1]) for i in range(2,n[0]+1)]) == list(range(1,n[0])) else print('Not jolly')
  except EOFError:
    break