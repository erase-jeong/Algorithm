
from collections import deque


def topological_sort(N,comparisons):
    graph=[[] for _ in range(N+1)] 
    in_degree=[0]*(N+1)  

    for A,B in comparisons:
        graph[A].append(B)
        in_degree[B]+=1


    queue=deque()
    for i in range(1,N+1):
        if in_degree[i]==0:
            queue.append(i)

    
    result=[]
    while queue:
        current=queue.popleft()
        result.append(current)
        for neighbor in graph[current]:
            in_degree[neighbor]-=1
            if in_degree[neighbor]==0:
                queue.append(neighbor)


    return result

    
N,M=map(int,input().split())

comparisons=[] 
for _ in range(M): 
    a,b=map(int,input().split()) 
    comparisons.append((a,b)) 


sorted_students=topological_sort(N,comparisons)

print(' '.join(map(str,sorted_students)))