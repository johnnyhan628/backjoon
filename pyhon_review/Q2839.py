#설탕 문제 왜 맞았는지 다시금 상기시키기

sugar = int(input())
bag = 0
while sugar >= 0 :
  if sugar % 5 == 0 :
    bag += (sugar // 5)
    print(bag)
    break
  else :
    sugar -= 3
    bag += 1  
else :
  print(-1)  