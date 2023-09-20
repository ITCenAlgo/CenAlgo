nums = list(filter(lambda x: x % 2, [int(input()) for _ in range(7)]))
print(f'{sum(nums)}\n{min(nums)}' if nums else -1)
