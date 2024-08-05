a=[]
for i in range(30):
  a.append(i+1)

for _ in range(28):
  a.remove(int(input()))

print(min(a))
print(max(a))