import java.util.*;

class Solution {
    public int solution(String[][] book_time) {

        // 1. 예약 시간 정렬 (입실 기준 오름차순)
        Arrays.sort(book_time, (o1, o2) -> {
            if (o1[0].equals(o2[0])) {
                return o1[1].compareTo(o2[1]);
            } else {
                return o1[0].compareTo(o2[0]);
            }
        });

        // 2. 시간 정수로 변환 + 청소 시간 10분 추가
        int[][] time = new int[book_time.length][2];
        for (int i = 0; i < book_time.length; i++) {
            int start = Integer.parseInt(book_time[i][0].replace(":", ""));
            int end = Integer.parseInt(book_time[i][1].replace(":", ""));

            end += 10;
            if (end % 100 >= 60) {
                end += 40;
            }

            time[i][0] = start;
            time[i][1] = end;
        }

        // 3. 우선순위 큐(가장 빨리 비는 방의 시간부터 나옴)
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 끝나는 시간 기준 최소 힙

        for (int i = 0; i < time.length; i++) {
            int start = time[i][0];
            int end = time[i][1];

            // pq의 맨 앞 = 가장 빨리 비는 방의 시간
            if (!pq.isEmpty() && start >= pq.peek()) {
                // 그 방을 재사용하니까, 그 방의 종료 시간을 현재 end로 갱신
                pq.poll();      // 기존 시간 제거
            }
            // 새로 배정(재사용이든 신규든, 어쨌든 이 예약이 끝나는 시간 넣기)
            pq.offer(end);
        }

        // pq에 들어있는 방의 개수 = 필요한 최소 객실 수
        return pq.size();
    }
}
