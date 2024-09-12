import sys

N = int(sys.stdin.readline())
dic = {value: index for index, value in enumerate(map(int, sys.stdin.readline().split()))}

N = int(sys.stdin.readline())
num_list = list(map(int, sys.stdin.readline().split()))
for num in num_list:
  if num in dic:
    print(1, end=' ')
  else :
    print(0, end=' ')