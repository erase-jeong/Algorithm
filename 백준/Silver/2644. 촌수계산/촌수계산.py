# 백준 2644 촌수계산 DFS

#입력값 받는 부분
N=int(input())  #사람 수
A,B=map(int,input().split()) #촌수 계산 대상
M=int(input()) #관계 수
graph=[[] for _ in range(N+1)]  #인접 리스트 생성
visited=[False]*(N+1) #방문 체크
result=[] #정답 저장용 리스트

#어떤 노드들이 연결되어 있는지 graph라는 2차원 배열에 저장 (관계 정보 저장)
for _ in range(M):
    x,y=map(int,input().split())
    graph[x].append(y) #graph[x].append(y)와 graph[y].append(x) 둘 다 해주는 이유는 양방향 관계이기 때문
    graph[y].append(x)
    
#dfs
def dfs(v,num):
    num+=1 #깊이 +1
    visited[v]=True #방문 처리
    
    if v==B: #목적지 도달 시
        result.append(num)
        
    for i in graph[v]: #인접 노드 탐색
        if not visited[i]:
            dfs(i,num)
    
dfs(A,0)
if len(result)==0: 
    print(-1) #도달하지 못했을 때는 친척 관계가 없는 것이므로 -1
else:
    print(result[0]-1) 
    # -1을 빼주는 이유 : DFS 내부에서 num+=1 을 하고 시작하니깐 실제로는 깊이 1부터 세는 효과가 나서 마지막 출력에서 -1을 해줌.