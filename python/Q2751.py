import sys
nums = []
for _ in range(int(input())) :
  nums.append(sys.stdin.readline())

for i in sorted(nums) :
  print(i)