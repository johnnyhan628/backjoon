a, b, c, d, e, f = map(int,input().split())

x = (c*e-b*f)//(a*e-b*d)
y = (a*f-c*d)//(a*e-b*d)
print(x, y)

'''
맘에 드는 다른 사람 코드

a,b,c,d,e,f=map(int,input().split())
x=(c*e-b*f)//(a*e-b*d)
y=(c*d-a*f)//(b*d-a*e)
print(x,y)


-크래머의 규칙으로 풀이한 것.
크래머의 공식 복습 필요
'''