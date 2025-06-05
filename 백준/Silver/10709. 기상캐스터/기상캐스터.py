H, W = map(int, input().split())
JOI = [list(input()) for _ in range(H)]
result = [[-1 for _ in range(W)] for _ in range(H)]

for i in range(H):
    for j in range(W):
        if JOI[i][j] == 'c':
            result[i][j] = 0
        elif j > 0 and result[i][j - 1] != -1:
            result[i][j] = result[i][j - 1] + 1

# 결과 출력
for row in result:
    print(' '.join(map(str, row)))
