#내 답
n = input()
N = list(input())
output = 0
for i in range(len(N)):
  output = output + int(N[i])
print(output)

#다른 사람 중 맘에 드는 답
'''
n = int(input())
print(sum([int(f) for f in input()]))
'''