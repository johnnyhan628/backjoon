#왜 c>=a1 조건이 붙는지 확인

a1, a0 = map(int, input().split())
c = int(input())
n = int(input())

if (a1*n + a0) <= c*n and c >= a1 :
  print(1)
else :
  print(0)  
