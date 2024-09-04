#값 받기
N, M = map(int,input().split())
A=[]
for _ in range(N) :
  A.append(list(str(input())))

#잘 만들어진 체스판 입력하기
board = [['W', 'B', 'W', 'B', 'W', 'B', 'W', 'B']
         ,['B', 'W', 'B', 'W', 'B', 'W', 'B', 'W']
         ,['W', 'B', 'W', 'B', 'W', 'B', 'W', 'B']
         ,['B', 'W', 'B', 'W', 'B', 'W', 'B', 'W']
         ,['W', 'B', 'W', 'B', 'W', 'B', 'W', 'B']
         ,['B', 'W', 'B', 'W', 'B', 'W', 'B', 'W']
         ,['W', 'B', 'W', 'B', 'W', 'B', 'W', 'B']
         ,['B', 'W', 'B', 'W', 'B', 'W', 'B', 'W']]

#비교
countList=[]
for a in range(N-7) :
  for b in range(M-7) :
    count = 0
    for i in range(8) :
      for j in range(8) :
        if A[i+a][j+b] == board[i][j] :
          count = count+1
    countList.append(min(count, 64-count))
print(min(countList))