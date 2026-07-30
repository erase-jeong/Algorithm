class Solution {
    public String[] solution(String[] names) {
        int n=names.length/5;
        if(names.length%5!=0) n++;
        
        String[] answer=new String[n];
        
        for(int i=0;i<n;i++){
            answer[i]=names[i*5];
        }
        return answer;
    }
}

/*
배열 전체의 길이 
그 중에서 5씩 건너뛰면서 배열인덱스 조사? 갱신
배열 사이즈 끝나기 전까지 반복하기

1. 전체 배열 길이를 순회한다.
2. 그 중에서 5씩 건너뛰면서 한다. 
남은 배열길이가 0이 아닐때까지 반복하기

7%5=1+...2 => 2
5%5=1+...0 => 1

1. result의 길이 = 몫(names.length/5) + 
    if(나머지가 존재){
        //+1 더한다
    }else{  //나머지가 없다면 
        //안더한다
    }
    
2. 5*idx
0, 5, 10 번째를 배열에 넣는다. 
*/