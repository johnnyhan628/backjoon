import sys
import math

a, b = map(int, sys.stdin.readline().split())
c, d = map(int, sys.stdin.readline().split())

e = a*d + c*b
f = b*d
num_gcd = math.gcd(e,f)
print(int(e/num_gcd), int(f/num_gcd))