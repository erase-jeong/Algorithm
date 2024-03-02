def solution(numbers):
    arr1=[0]*10
    sum=0
    
    for i in numbers:
        if i==0: arr1[i]+=1
        elif i==1: arr1[i]+=1
        elif i==2: arr1[i]+=1
        elif i==3: arr1[i]+=1
        elif i==4: arr1[i]+=1
        elif i==5: arr1[i]+=1
        elif i==6: arr1[i]+=1
        elif i==7: arr1[i]+=1
        elif i==8: arr1[i]+=1
        elif i==9: arr1[i]+=1
    
    #print(arr1)
    for i,ch in enumerate(arr1):
        if ch==0:
            sum+=i
    return sum
        