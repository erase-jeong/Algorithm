class Solution {
    public int[] solution(int[] prices) {
        int[] answer=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int time=0;
            for(int j=i+1; j<prices.length;j++){
                time++; //일단 1초가 흐른 것으로 간주
                if(prices[i]>prices[j]){
                    break; //여기서 멈춤
                }
            }
            answer[i]=time;
        }
        return answer;
    }
}

/*
i이후로 prices[i]보다 작은 값이 처음 나오는 시점까지의 거리
=> 각 인덱스마다 이걸 구하기

i=0, prices[0]=1
*/