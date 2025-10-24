import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a=slicer[0],b=slicer[1],c=slicer[2];
        List<Integer> lst=new ArrayList<>();
        
        if(n==1){
            for(int i=0;i<=b;i++){
                lst.add(num_list[i]);
            }
        }else if(n==2){
            for(int i=a;i<num_list.length;i++){
                lst.add(num_list[i]);
            }
        }else if(n==3){
            for(int i=a;i<=b;i++){
                lst.add(num_list[i]);
            }
            
        }else if(n==4){
            for(int i=a;i<=b;i+=c){
                lst.add(num_list[i]);
            }
            
        }
        
        System.out.println(lst);
        
        int lstSize=lst.size();
        answer=new int[lstSize];
        
        for(int i=0;i<lstSize;i++){
            answer[i]=lst.get(i);
        }
        
        return answer;
    }
}