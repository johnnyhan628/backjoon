#내 정답
k, q, l, b, n, p = 1, 1, 2, 2, 2, 8
a, v, c, d, e, f = map(int, input().split())
print(k-a, q-v, l-c, b-d, n-e, p-f)

#다른 사람의 맘에드는 답 - zip 함수 사용
'''
list1 = map(int, input().split())
list2 = [1, 1, 2, 2, 2, 8]
a = [y-x for x, y in zip(list1, list2)]
for i in a:
    print(i, end=' ')
'''