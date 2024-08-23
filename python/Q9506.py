while 1 :
  N = int(input())
  if N == -1 :
    break
  A = []
  isPerfect = 0
  for i in range(1, N):
    if N % int(i) == 0:
      A.append(i)
      isPerfect += i
      
  if isPerfect == N :
    A.sort()
    output = str(N) + ' = '
    for i in range(len(A)):
        if i != len(A)-1 :
          output = output + str(A[i]) + ' + '
        elif i == len(A)-1:
          output = output + str(A[i])
    print(output)        
  else :
    print(N, 'is NOT perfect.')