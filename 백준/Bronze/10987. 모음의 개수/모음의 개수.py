word=input()
vowel=['a','e','i','o','u']
cnt=0
for i in word:
    if(i in vowel):
        cnt+=1

print(cnt)