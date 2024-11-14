str1=input()
cnt=0
word=''

for i in range(len(str1)):
    word+=str1[i]
    cnt+=1
    if(cnt==10):
        print(word)
        cnt=0
        word=''
    elif(i==len(str1)-1):
        print(word)