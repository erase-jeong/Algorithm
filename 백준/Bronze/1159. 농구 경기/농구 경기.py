n=int(input())
name_list=[]
for _ in range(n):
    name=input("")
    #name[0]만 남기기
    name_list+=name[0]

#name_list 완성
#중복제거하여 총 몇개인지 확인
name_set=set(name_list)
name_count=list(name_set)
name_count.sort()

#len(name_count)
count_list=[0]*len(name_count)


for i in range(len(name_count)):
    for j in range(len(name_list)):
        if name_count[i]==name_list[j]:
            count_list[i]=count_list[i]+1

count=0
for i in range(len(count_list)):
    if count_list[i]>=5:
        print(name_count[i],end="")
        count+=1


if count==0:
    print("PREDAJA")