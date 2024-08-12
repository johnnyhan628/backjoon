A, B = [], []
for i in range(9) :
  col = list(map(int, input().split()))
  value = max(col)
  row = col.index(value)
  B.append([i, row, value])

max_value = 0
col = 0
row = 0
for i in range(9) :
  if B[i][2] > max_value :
    max_value = B[i][2]
    col = B[i][0]
    row = B[i][1]

print(max_value)
print(col+1, row+1)