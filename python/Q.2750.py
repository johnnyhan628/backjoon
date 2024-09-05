N = int(input())
saveData = []
for _ in range(N) :
  saveData.append(int(input()))

saveData.sort()

for i in saveData :
  print(i)