import sys

num_list = []
for _ in range(int(sys.stdin.readline())) :
  x, y = map(int, sys.stdin.readline().split())
  num_list.append([x, y])

num_list.sort(key = lambda x : (x[1], x[0]))
for i in num_list :
  print(i[0], i[1])