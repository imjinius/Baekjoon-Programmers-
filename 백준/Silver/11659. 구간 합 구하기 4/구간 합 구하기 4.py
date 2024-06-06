N, M = map(int, input().split())
arr = list(map(int, input().split()))
sum = 0
result = []

for i in range(len(arr)):
  sum += arr[i]
  arr[i] = sum

while M > 0:
  a, b = (int(x) - 1 for x in input().split())
  previous = 0 if a == 0 else arr[a-1]
  result.append(str(arr[b] - previous))
  M -= 1

print("\n".join(result))