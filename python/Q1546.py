N = int(input())
numbers = list(map(float, input().split()))
M = max(numbers)
K = sum(numbers)
print(K/M*100/N)