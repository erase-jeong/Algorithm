sumScore=0
for i in range(5):
    score=int(input())
    if score<40:
        sumScore+=40
    else:
        sumScore+=score

print(int(sumScore/5))