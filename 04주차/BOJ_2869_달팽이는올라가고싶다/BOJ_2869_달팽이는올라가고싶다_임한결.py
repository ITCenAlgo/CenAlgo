import math
l = list(map(int, input().split())) #[2,1,5]
print(math.ceil((l[2]-l[1])/(l[0]-l[1])))