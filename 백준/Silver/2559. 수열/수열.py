def main():
  import sys
  import itertools

  inputs = map(str.split, sys.stdin.read().splitlines())
  N, K = map(int, next(inputs))
  arr = list(itertools.accumulate(map(int, next(inputs)), initial=0))
  max_diff =  max(arr[i+K] - arr[i] for i in range((N-K)+1))
  print(max_diff)

main()
