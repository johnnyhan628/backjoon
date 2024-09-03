N, M = map(int, input().split())
card = list(map(int, input().split()))
sumList = []
for i in range(len(card)-2):
  for j in range(i+1, len(card)-1):
    for g in range(j+1, len(card)) :
      k = card[i] + card[j] + card[g]
      if k <= M :
        sumList.append(k)      
print(max(sumList))