T=int(input())
for tc in range(1,T+1):
    line=input()
    c_list=[]

    for i in range(1,len(line)):
        cnt=0
        word=line[:i]
        next_start=i
        while len(line)>=next_start+len(word):
            next_word=line[next_start:next_start+len(word)]

            if word==next_word:
                cnt+=1
                next_start+=len(word)
            else:
                break
        c_list.append(cnt)

    max_value=max(c_list)
    max_index=c_list.index(max_value)
    print(f"#{tc} {max_index+1}")