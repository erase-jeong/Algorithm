import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[][] arr=new int[n][];
        
        for(int i=0;i<arr.length;i++){
            String line=sc.nextLine();
            String[] parts=line.split(" ");
            arr[i]=new int[parts.length];

            for(int j=0;j<parts.length;j++){
                arr[i][j]=Integer.parseInt(parts[j]);
            }
            //System.out.println(Arrays.toString(arr[i]));
        }
        //확인용 출력
        //System.out.println(Arrays.deepToString(arr));

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                if(j==0){
                    arr[i][j]+=arr[i-1][j];
                }
                else if(j==arr[i].length-1){
                    arr[i][j]+=arr[i-1][j-1];
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j-1]+arr[i][j],arr[i-1][j]+arr[i][j]);
                }

            }
        }
        //System.out.println(Arrays.deepToString(arr));
        Arrays.sort(arr[n-1]);
        System.out.println(arr[n-1][n-1]);
    }
}