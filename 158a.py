n, k = map(int, input().split())
scores = tuple(map(int, input().split()))
kth_score = scores[k - 1]
print(sum(score and score >= kth_score for score in scores))
