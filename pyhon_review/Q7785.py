import sys

N = int(sys.stdin.readline())
word_dict = {} 
for _ in range(N) :
    A, B = sys.stdin.readline().split()
    word_dict[A] = B

for key, value in sorted(word_dict.items(), reverse=True) :
    if value == 'enter' :
        print(key)
