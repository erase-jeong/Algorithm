import java.util.*;

class Solution{
    //N, S, W, E 순서대로 이동 방향 정의
    static int[] dr={-1,1,0,0};
    static int[] dc={0,0,-1,1};
    
    public int[] solution(String[] park, String[] routes){
        int h=park.length;
        int w=park[0].length();
        
        int r=0;
        int c=0;
        
        //1.시작위치 (S)찾기
        for(int i=0;i<h;i++){
            if(park[i].contains("S")){
                r=i;
                c=park[i].indexOf("S");
                break;
            }
        }
        
        //2. 명령(routes) 처리
        for(String route:routes){
            String[] split=route.split(" ");
            String dir=split[0];
            int dist=Integer.parseInt(split[1]);
            
            //방향 문자열을 인덱스(0,1,2,3)로 변환
            int dIdx="NSWE".indexOf(dir);
            
            int curR=r;
            int curC=c;
            boolean isPossible=true;
            
            //3.한 칸씩 가보며 검증
            for(int j=0;j<dist;j++){
                curR+=dr[dIdx];
                curC+=dc[dIdx];
                
                //범위 밖으로 나가거나 장애물(X)를 만나는지 체크
                if(curR<0 || curR>=h || curC<0 || curC>=w || park[curR].charAt(curC)=='X'){
                    isPossible=false;
                    break;
                }
            }
            
            //4.모든 이동이 가능했을 때만 실제 위치 갱신
            if(isPossible){
                r=curR;
                c=curC;
            }
        }
        return new int[]{r,c};
    }
}