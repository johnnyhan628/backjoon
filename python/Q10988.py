#내 정답
S = input()
K = list(S)
K.reverse()
R = ''.join(K)
if R == S : 
  print(1)
else :
  print(0)

#맘에 든 다른 사람의 정답 str의 reversed() 메서드를 사용함
'''
a = input()
if a == ''.join(reversed(a)):
    print("1")
else:
    print("0")
'''  
