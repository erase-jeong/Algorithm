T=int(input())
vowel=['a','e','i','o','u']
for tc in range(1,T+1):
    word=input()
    ans=''
    for i in word:
        if(i!='a' and i!='e' and i!='i' and i!='o' and i!='u'):
            ans+=i
    
    print(f'#{tc} {ans}')
    
