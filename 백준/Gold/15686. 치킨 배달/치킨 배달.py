from itertools import combinations

N,M=map(int,input().split())
city=[]
for _ in range(N):
    data=list(map(int,input().split()))
    city.append(data)

    
#각 집 위치 기억 -> 리스트에 위치 담아두기
#치킨 위치 기억 -> 리스트에 위치 담아두기
homes=[]
stores=[]
for i in range(N):
    for j in range(N):
        if(city[i][j]==1):
            homes.append((i,j))
        elif(city[i][j]==2):
            stores.append((i,j))
            
#치킨집 M개 뽑기
chickenCandidates=list(combinations(stores,M))


totalDistances=[]
for chickenCandidate in chickenCandidates:
    totalDistance=0
    for home in homes:
        minDistance=9999 #큰 수로 초기화
        for store in chickenCandidate:
            distance = abs(home[0] - store[0]) + abs(home[1] - store[1])
            minDistance=min(minDistance,distance)
        totalDistance+=minDistance
    totalDistances.append(totalDistance)

print(min(totalDistances))