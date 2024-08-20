#python의 삼항연산자 복습 필요
A, B, V = map(int,input().split())
day = (V-B)/(A-B)
print(int(day) if int(day)==day else int(day)+1)