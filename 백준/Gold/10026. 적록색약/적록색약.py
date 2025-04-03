from collections import deque

# 방향: 상하좌우
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x, y, visited, board, is_weak):
    queue = deque()
    queue.append((x, y))
    visited[x][y] = True
    current_color = board[x][y]

    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < N and 0 <= ny < N and not visited[nx][ny]:
                next_color = board[nx][ny]
                if is_weak:
                    # 적록색약: R == G
                    if (current_color in "RG" and next_color in "RG") or current_color == next_color:
                        visited[nx][ny] = True
                        queue.append((nx, ny))
                else:
                    # 일반인: 색이 완전히 같아야 함
                    if next_color == current_color:
                        visited[nx][ny] = True
                        queue.append((nx, ny))

# 입력
N = int(input())
board = [list(input().strip()) for _ in range(N)]

# 일반인 구역 수 세기
visited_normal = [[False]*N for _ in range(N)]
count_normal = 0
for i in range(N):
    for j in range(N):
        if not visited_normal[i][j]:
            bfs(i, j, visited_normal, board, is_weak=False)
            count_normal += 1

# 적록색약 구역 수 세기
visited_weak = [[False]*N for _ in range(N)]
count_weak = 0
for i in range(N):
    for j in range(N):
        if not visited_weak[i][j]:
            bfs(i, j, visited_weak, board, is_weak=True)
            count_weak += 1

print(count_normal, count_weak)