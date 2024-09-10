import sys

list = []
for i in range(int(sys.stdin.readline().strip())):
  age, name = sys.stdin.readline().strip().split()
  list.append([i, int(age), name])

list.sort(key=lambda x: (x[1], x[0]))
for person in list:
  print(person[1], person[2])