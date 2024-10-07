'''
*복습 목록
1. from collections import Counter의 이유
2. Counter 함수
3. 리스트 선언 
'''

import sys
from collections import Counter

_ = input()
num_list = list(map(int, sys.stdin.readline().split()))
num_counter = Counter(num_list)

_ = input()
out_list = list(map(int, sys.stdin.readline().split()))

result = [str(num_counter[i]) for i in out_list]
print(" ".join(result))