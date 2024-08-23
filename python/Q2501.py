N, K = map(int, input().split())
A = []
for i in range(1, N + 1):
    if N % int(i) == 0:
        A.append(int(i))
A = list(set(A))
A.sort()
print(A[K-1] if len(A) >= K else 0)