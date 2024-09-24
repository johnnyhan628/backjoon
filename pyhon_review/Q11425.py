'''
내 제출
'''
import sys

N, M = map(int, sys.stdin.readline().split())
list = []
for _ in range(N):
  list.append(sys.stdin.readline())

count = 0
for _ in range(M):
  word = sys.stdin.readline()
  if word in list:
    count += 1

print(count)

'''
동일한 코드에서 set을 사용한 방법
import sys

N, M = map(int, sys.stdin.readline().split())
word_set = set()  # 리스트 대신 집합을 사용하여 검색 시간을 줄임
for _ in range(N):
    word_set.add(sys.stdin.readline().strip())  # 개행 문자 제거

count = 0
for _ in range(M):
    word = sys.stdin.readline().strip()  # 개행 문자 제거
    if word in word_set:  # 집합에서의 검색은 O(1)
        count += 1

print(count)

'''