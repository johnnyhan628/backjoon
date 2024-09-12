import sys

N = int(sys.stdin.readline())
num_list = list(map(int, sys.stdin.readline().split()))

tmp_list = sorted(set(num_list))

# 값과 인덱스를 매핑하는 딕셔너리 생성
index_map = {value: index for index, value in enumerate(tmp_list)}

# 각 숫자의 압축된 좌표 출력
for num in num_list:
    print(index_map[num], end=' ')