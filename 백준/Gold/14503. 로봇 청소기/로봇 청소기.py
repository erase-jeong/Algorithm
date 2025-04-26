# 입력
N, M = map(int, input().split())
r, c, d = map(int, input().split())
room = [list(map(int, input().split())) for _ in range(N)]

# 방향: 북(0), 동(1), 남(2), 서(3)
dr = [-1, 0, 1, 0]  # 행 이동
dc = [0, 1, 0, -1]  # 열 이동

# 청소한 칸 개수
clean_count = 0

while True:
    # 1. 현재 칸 청소
    if room[r][c] == 0:
        room[r][c] = 2  # 2: 청소 완료 표시
        clean_count += 1

    # 2. 주변 4칸 확인
    cleaned = False
    for _ in range(4):
        # 반시계 방향 회전
        d = (d + 3) % 4
        nr, nc = r + dr[d], c + dc[d]

        # 청소되지 않은 빈 칸이 있다면
        if 0 <= nr < N and 0 <= nc < M and room[nr][nc] == 0:
            r, c = nr, nc  # 전진
            cleaned = True
            break

    if not cleaned:
        # 3. 후진
        back_d = (d + 2) % 4
        br, bc = r + dr[back_d], c + dc[back_d]

        # 뒤가 벽이면 종료
        if room[br][bc] == 1:
            break
        else:
            r, c = br, bc  # 후진

# 출력
print(clean_count)
