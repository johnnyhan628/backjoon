#math.sqrt() 함수 복습
import math

N = input()
A = list(map(int, input().split()))
count = 0
for i in A :
  if i != 1:
    B = math.sqrt(i)
    notPrime=0
    for j in range(2, int(B)+1) :
      if i%j == 0 :
        notPrime += 1
    if notPrime == 0 :
      count += 1
print(count)