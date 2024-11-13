import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        //입력값 저장
        int[] science=new int[4];
        for(int i=0;i<4;i++){
            science[i]=scanner.nextInt();
        }

        int history=scanner.nextInt();
        int geography=scanner.nextInt();

        //과학 점수 중에서 상위 3개 선택
        Arrays.sort(science); //오름차순 정렬
        int scienceSum=science[1]+science[2]+science[3]; //상위 3개 점수 합

        //역사와 지리 중 높은 점수 선택
        int socialMax=Math.max(history,geography);

        //총 점수 출력
        int totalScore=scienceSum+socialMax;
        System.out.println(totalScore);
    }
}