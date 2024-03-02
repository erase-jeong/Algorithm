def solution(n):
    ap=[]
    k=''
    for i in range(len(str(n))):
        ap.append(str(n)[i])
    ap.sort()
    for i in range(1,len(ap)+1):
        k+=(ap[len(ap)-i])
    return int(k)