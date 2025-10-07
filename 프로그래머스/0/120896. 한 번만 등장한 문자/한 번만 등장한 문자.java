import java.util.*;
class Solution{
    public String solution(String s){
        String answer="";
        String[] arr=s.split("");
        int cnt=0;
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.println("i : "+i);
            cnt=0;
            for(int j=0;j<arr.length;j++){
                //System.out.println("arr[i] : "+arr[i]+", arr[j] : "+arr[j]);
                //System.out.println("cnt : "+cnt);
                if(arr[i].equals(arr[j])){
                    cnt++;                   
                }
            }
            if(cnt==1){
            answer+=arr[i];
            }
        }
           
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr));
        
        return answer;
    }
}
