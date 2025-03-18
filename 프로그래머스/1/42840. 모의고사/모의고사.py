def solution(answers):
    n=len(answers)
    
    student_1=[]
    student_2=[]
    student_3=[]
    
    #1번 학생
    for i in range(n):
        if i%5==0:
            student_1.append(1)
        elif i%5==1:
            student_1.append(2)
        elif i%5==2:
            student_1.append(3)
        elif i%5==3:
            student_1.append(4)
        elif i%5==4:
            student_1.append(5)
    
    #2번 학생
    for i in range(n):
        #짝수면 다 2
        if i%2==0:
            student_2.append(2)
        elif i%8==1:
            student_2.append(1)
        elif i%8==3:
            student_2.append(3)
        elif i%8==5:
            student_2.append(4)
        elif i%8==7:
            student_2.append(5)
    
    #3번 학생
    for i in range(n):
        if i%10==0 or i%10==1:
            student_3.append(3)
        elif i%10==2 or i%10==3:
            student_3.append(1)
        elif i%10==4 or i%10==5:
            student_3.append(2)
        elif i%10==6 or i%10==7:
            student_3.append(4)
        elif i%10==8 or i%10==9:
            student_3.append(5)
    
    
    cnt1,cnt2,cnt3=0,0,0
    
    #답 체크하기
    for i in range(n):
        if answers[i]==student_1[i]:
            cnt1+=1
        
        if answers[i]==student_2[i]:
            cnt2+=1
        
        if answers[i]==student_3[i]:
            cnt3+=1
    
    
    #최고 점수 게산
    max_score=max(cnt1,cnt2,cnt3)
    result=[]
    
    #최고 점수를 가진 학생 찾기
    if cnt1==max_score:
        result.append(1)
    if cnt2==max_score:
        result.append(2)
    if cnt3==max_score:
        result.append(3)
    
    return result