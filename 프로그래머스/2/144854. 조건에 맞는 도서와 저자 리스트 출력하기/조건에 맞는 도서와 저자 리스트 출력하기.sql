/*
select b.book_id,a.author_name,date_format(b.published_date,'%Y-%m-%d') as published_date 
from book as b inner join author as a on b.author_id=a.author_id
where b.category='경제'
order by b.published_date asc;
*/

-- 1. 구조먼저 살펴보기
-- SELECT * FROM BOOK;
-- SELECT * FROM AUTHOR;

-- 2.두 테이블 JOIN하기
/*
SELECT * 
FROM BOOK AS B
JOIN AUTHOR AS A
ON B.AUTHOR_ID = A.AUTHOR_ID  -- 조인하면 기준점 필수

WHERE CATEGORY='경제'
*/


SELECT B.BOOK_ID   -- 두 테이블 조인했으므로 어느 테이블인지 명시
    ,A.AUTHOR_NAME
    -- ,B.PUBLISHED_DATE
    ,DATE_FORMAT(B.PUBLISHED_DATE,'%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK AS B
JOIN AUTHOR AS A
ON B.AUTHOR_ID = A.AUTHOR_ID  

WHERE CATEGORY='경제'
-- ORDER BY B.PUBLISHED_DATE ASC;  -- 여기에 약어 써줘도 됨
ORDER BY PUBLISHED_DATE ASC;