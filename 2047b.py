from collections import Counter

for _ in range(int(input())):
    _n, s = input(), input()
    most_common = Counter(s).most_common()
    mx, mn = most_common[0][0], most_common[-1][0]
    mn_idx = s.index(mn)
    print(s[:mn_idx] + mx + s[mn_idx+1:])
