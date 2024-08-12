s = list(input())
count = 0
for i in range(len(s)) :
  if ord(s[i]) < 68 :
    count += 3
  elif ord(s[i]) < 71 :
    count += 4
  elif ord(s[i]) < 74 :
    count += 5
  elif ord(s[i]) < 77 :
    count += 6
  elif ord(s[i]) < 80 :
    count += 7
  elif ord(s[i]) < 84 :
    count += 8
  elif ord(s[i]) < 87 :
    count += 9
  elif ord(s[i]) < 91 :
    count += 10
  else :
    count += 11
print(count)