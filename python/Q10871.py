a, b = map(int, input().split())
numbers = list(map(int, input().split()))
filtered_numbers = [num for num in numbers if num<b]
print(" ".join(map(str, filtered_numbers)))