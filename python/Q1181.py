import sys

str_list = set()
for _ in range(int(sys.stdin.readline().strip())):
  line = sys.stdin.readline().strip()
  str_list.add(line)

str_list = list(str_list)
str_list.sort(key=lambda x: (len(x), x))

for item in str_list:
  print(item)