word=input()
results=[]
n=len(word)
for i in range(1,n):
    for j in range(i+1,n):
        part1=word[:i]
        part2=word[i:j]
        part3=word[j:]
        results.append(part1[::-1]+part2[::-1]+part3[::-1])
    
results.sort()
print(results[0])