while True :

  list = []
  a, b, c = map(int, input().split())

  if a+b+c == 0 :
    break

  list.append(a)
  list.append(b)
  list.append(c)

  list.sort()

  if (list[0]+list[1]) <= list[2] :
    print("Invalid")
  elif list[0] == list[1] == list[2] :
    print("Equilateral")
  elif (list[0] == list[1] and list[0] != list[2]) or (list[0] == list[2] and list[0] != list[1]) or (list[0] != list[1] and list[1] == list[2]):
    print("Isosceles")
  elif list[0] != list[1] and list[1] != list[2] and list[0] != list[2] :
    print("Scalene")