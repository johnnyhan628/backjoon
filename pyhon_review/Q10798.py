A = []
B = ""
for _ in range(5) :
  A.append(list(input()))

for i in range(max(len(row) for row in A)) :
  for j in range(5) :
    try :
      B += A[j][i]
    except IndexError :
      continue
      
print(B)     