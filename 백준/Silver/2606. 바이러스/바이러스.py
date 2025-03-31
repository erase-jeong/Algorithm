computer = int(input())
n = int(input())

node_visited = [[] * _ for _ in range(computer + 1)]

for i in range(n):
    a, b = map(int, input().split())
    node_visited[a].append(b)
    node_visited[b].append(a)


def bfs(node_visited,start):
    visited, need_visited = [], []
    need_visited.append(start)

    while need_visited:
        node = need_visited[0]
        del need_visited[0]

        if node not in visited:
            visited.append(node)
            need_visited.extend(node_visited[node])
    return visited


print(len(bfs(node_visited,1)) - 1)