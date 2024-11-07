a,b,c=map(int,input().split())
symbol=['+','-','*','/','=']

#(a , b) == c
#a == (b,c)

if(a+b==c):
    print(f'{a}+{b}={c}')
elif(a-b==c):
    print(f'{a}-{b}={c}')
elif(a*b==c):
    print(f'{a}*{b}={c}')
elif(a/b==c):
    print(f'{a}/{b}={c}')

elif(a==b+c):
    print(f'{a}={b}+{c}')
elif(a==b-c):
    print(f'{a}={b}-{c}')
elif(a==b*c):
    print(f'{a}={b}*{c}')
elif(a==b/c):
    print(f'{a}={b}/{c}')