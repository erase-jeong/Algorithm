class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] position={0,0};
        
        int width=board[0]/2;
        int height=board[1]/2;
        
        
        for(int i=0;i<keyinput.length;i++){
            //가로-세로-방향
            if(keyinput[i].equals("left")){
                //좌우방향 확인
                if((position[0]-1)>=-width && (position[0]-1)<=width){
                   position[0]-=1; 
                } 
            }
            else if(keyinput[i].equals("right")){
                //좌우방향 확인
                
                if((position[0]+1)>=-width && (position[0]+1)<=width){
                   position[0]+=1; 
                } 
                
            }
            else if(keyinput[i].equals("up")){
                //상하방향 확인
                if((position[1]+1)>=-height && (position[1]+1)<=height){
                   position[1]+=1; 
                } 
                
            }
            else if(keyinput[i].equals("down")){
                //상하방향 확인           
                if((position[1]-1)>=-height && (position[1]-1)<=height){                    
                   position[1]-=1; 
                } 
            }
        }
        
        return position;
    }
}

//캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 solution 함수