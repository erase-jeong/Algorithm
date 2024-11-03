T=int(input())
for tc in range(1,T+1):
    input_str=input()
    ans=''
    for i in range(len(input_str)):
        if(input_str[len(input_str)-i-1]=='p'):
            ans+='q'
        elif(input_str[len(input_str)-i-1]=='q'):
            ans+='p'
        elif(input_str[len(input_str)-i-1]=='b'):
            ans+='d'
        elif(input_str[len(input_str)-i-1]=='d'):
            ans+='b'
            
        #reverse_str+=input_str[len(input_str)-i-1]

    print(f'#{tc} {ans}')