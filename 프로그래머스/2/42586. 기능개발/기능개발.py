def solution(progresses,speeds):
    devTime=[]
    answer=[]
    count=0

    for i in range(len(progresses)):
        time=(100-progresses[i])/speeds[i]
        if time%1!=0:
            time=time//1+1

        devTime.append(int(time))

    #print(devTime)
    tmp=devTime[0]

    for i in range(1,len(devTime)):
        if tmp<devTime[i]:
            count+=1
            answer.append(count)
            count=0
            tmp=devTime[i]
        else:
            count+=1

        if i==len(devTime)-1:
            answer.append(count+1)

    return answer