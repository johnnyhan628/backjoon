#list, set, index, max, count 복습 필수
a = input().upper()
b = list(set(a))
cnt = []
for i in b:
  cnt.append(a.count(i))

if cnt.count(max(cnt)) > 1:
  print("?")
else:
  print(b[(cnt.index(max(cnt)))])