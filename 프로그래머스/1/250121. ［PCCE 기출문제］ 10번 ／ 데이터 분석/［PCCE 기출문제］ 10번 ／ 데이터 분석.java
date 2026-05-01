import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        //1.컬럼명에 따른 인덱스 번호를 미리 정한다
        int extIdx=getColumnIndex(ext);
        int sortIdx=getColumnIndex(sort_by);
        
        List<int[]> lst=new ArrayList<>();
        
        //2.필터링 로직 (if-else 반복을 제거)
        for(int[] row:data){
            if(row[extIdx]<val_ext){
                lst.add(row);
            }
        }
        
        //3.정렬 로직(final 변수를 사용하여 에러 방지)
        final int targetSortIdx=sortIdx;
        lst.sort(Comparator.comparingInt(array->array[targetSortIdx]));
        
        //4.리스트를 다시 2차원 배열로 변환하여 반환
        return lst.toArray(new int[lst.size()][]);
    }
    
    //컬럼 이름을 인덱스로 바꿔주는 헬퍼 메서드
    private int getColumnIndex(String columnName){
        switch(columnName){
            case "code": return 0;
            case "date": return 1;
            case "maximum": return 2;
            case "remain": return 3;
            default: return -1;
        }
    }
}