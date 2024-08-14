# continue, pass 구분할 것.
# s[i] in s[i+1:] 구분 복습할 것
N = int(input())
count = N
for _ in range(N) :
  s = list(input())
  for i in range(len(s)-1) :
    if s[i] == s[i+1] :
      continue
    elif s[i] in s[i+1:] :
      count -= 1
      break
print(count)