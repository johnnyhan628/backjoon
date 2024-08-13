#2차원 배열 선언하는 방법 복습 필요
A = [[1 for i in range(100)] for j in range(100)]
B = int(input())
for _ in range(B) :
  x, y = map(int, input().split())
  for i in range(10) :
    for j in range(10) :
      A[x+i-1][y+j-1] = 0

count = 0
for i in range(100) :
  for j in range(100) :
    if A[i][j] == 0 :
      count += 1

print(count)