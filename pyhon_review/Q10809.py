#97부터 122까지 들어있는 list 생성
outputList = list(chr(i) for i in range(97, 123))
S = input()
#find 함수
#문자열에서 i가 있으면 문자열의 index를 주고 없으면 -1을 뱉는다
for i in outputList:
  print(S.find(i), end = ' ')
