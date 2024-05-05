word=input()

#result 초기화
result=[]
for i in range(26):
    result.append(0)

result[0]=word.count('a')
result[1]=word.count('b')
result[2]=word.count('c')
result[3]=word.count('d')
result[4]=word.count('e')
result[5]=word.count('f')
result[6]=word.count('g')
result[7]=word.count('h')
result[8]=word.count('i')
result[9]=word.count('j')
result[10]=word.count('k')
result[11]=word.count('l')
result[12]=word.count('m')
result[13]=word.count('n')
result[14]=word.count('o')
result[15]=word.count('p')
result[16]=word.count('q')
result[17]=word.count('r')
result[18]=word.count('s')
result[19]=word.count('t')
result[20]=word.count('u')
result[21]=word.count('v')
result[22]=word.count('w')
result[23]=word.count('x')
result[24]=word.count('y')
result[25]=word.count('z')

for i in range(26):
    print(result[i], end=" ")