N=int(input())
wordList=[]

for _ in range(N):
    word=input()
    wordList.append(word)

wordList=list(set(wordList)) #중복된 단어 제거

# 단어를 길이순으로 먼저 정렬하고, 길이가 같으면 사전 순으로 정렬
wordList.sort(key=lambda x:(len(x), x))

# 단어 출력
for word in wordList:
    print(word)