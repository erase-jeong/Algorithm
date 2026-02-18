import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int [] student=new int[n];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            student[i]=Integer.parseInt(st.nextToken());
        }

        //1. 투 포인터 쓰려면 반드시 정렬해야함
        Arrays.sort(student);

        long cnt=0; //*주의 : 정답이 int 범위를 넘을 수 있음 (최대 약 1666억)

        //2. 한 명(i)를 고정하고 나머지 두명(left, right)을 투 포인터로 탐색
        for(int i=0;i<n-2;i++){
            //가지치기 : 이미 첫번째 수가 0보다 크다면, 뒤의 수는 다 양수라 합이 0이 될 수 없음
            if(student[i]>0) break;

            int left=i+1;
            int right=n-1;

            while(left<right){
                int sum=student[i]+student[left]+student[right];

                if(sum==0){
                    //합이 0인 경우 (정답)

                    //[중요] 중복된 수 처리 로직
                    if(student[left]==student[right]){
                        //남은 구간의 숫자가 모두 같음 -> nC2 공식 적용
                        int count=right-left+1;
                        cnt+=(long)count*(count-1)/2;
                        break; //더 볼 필요 없음
                    }else{
                        // 양쪽 끝에 같은 숫자가 여러 개 있는 경우
                        int lCnt=1;
                        int rCnt=1;

                        //왼쪽 중복 개수 세기
                        while(left+1<right && student[left]==student[left+1]){
                            lCnt++;
                            left++;
                        }

                        //오른쪽 중복 개수 세기
                        while(right-1>left && student[right]==student[right-1]){
                            rCnt++;
                            right--;
                        }

                        //조합의 수 = 왼쪽 개수 * 오른쪽 개수
                        cnt+=(long)lCnt*rCnt;

                        //다음 탐색을 위해 포인터 이동
                        left++;
                        right--;
                    }
                }else if(sum>0){
                    //합이 크면 오른쪽 포인터를 줄임
                    right--;
                }else{  //합이 작으면 왼쪽 포인터를 늘림
                    left++;
                }
            }
        }
        System.out.println(cnt);
    }
}
