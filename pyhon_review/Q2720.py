# IN %= Quarter 문법 확인
QUARTER, DIME, NICKEL, PENNY = 25, 10, 5, 1
A = int(input())
for _ in range(A):
    IN = int(input())
    num_quarters = IN // QUARTER
    IN %= QUARTER
    num_dimes = IN // DIME
    IN %= DIME
    num_nickels = IN // NICKEL
    IN %= NICKEL
    num_pennies = IN // PENNY
    print(num_quarters, num_dimes, num_nickels, num_pennies)
print()