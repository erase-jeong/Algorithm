X,Y=map(int,input().split())

def Rev(N):
    line=list(map(int,str(N)))
    line.reverse()

    output=int(''.join(map(str,line)))

    return output

print(Rev(Rev(X)+Rev(Y)))