from itertools import permutations

def solution(k,dungenons):
    
    dungenons_set=list(permutations(dungenons))
    dungenons_set=[list(p) for p in dungenons_set]
    
    answers=[0]*len(dungenons_set)
    
    i=0
    for dungenon in dungenons_set:
        my_energy=k
        for min_energy,used_energy in dungenon:
            if my_energy>=min_energy:
                my_energy-=used_energy
                answers[i]+=1
        i+=1
    return max(answers)

