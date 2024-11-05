word=list(input())
#upper메소드를 사용해서 전체 문자를 대문자로 변환하여 변수에 저장한다.
for i in range(len(word)):
    word[i]=word[i].upper()
#print(word)

#비교를 하기 위해 set함수를 사용하여 중복된 문자값을 제거한 후 변수에 저장한다.
set_word=set(word)
set_word=list(set_word)

#for문을 이용하여 알파벳이 사용된 횟수를 리스트에 저장한다.
word_cnt=[0]*len(set_word)
for i in range(len(word)):
    for j in range(len(set_word)):
        if(word[i]==set_word[j]):
            word_cnt[j]+=1

#print(word_cnt)
#print(max(word_cnt))
#print(word_cnt.count(max(word_cnt)))

if((word_cnt.count(max(word_cnt)))>=2):
    print("?")
else:
    max_index=word_cnt.index(max(word_cnt))
    print(set_word[max_index])