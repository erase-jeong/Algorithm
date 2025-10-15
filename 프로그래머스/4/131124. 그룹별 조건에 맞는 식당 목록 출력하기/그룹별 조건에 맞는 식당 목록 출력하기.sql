SELECT 
    P.MEMBER_NAME
    ,R.REVIEW_TEXT
    ,DATE_FORMAT(R.REVIEW_DATE,'%Y-%m-%d') AS REVIEW_TEXT
FROM MEMBER_PROFILE AS P
JOIN REST_REVIEW AS R
ON P.MEMBER_ID=R.MEMBER_ID
WHERE P.MEMBER_ID IN 
-- 메인쿼리 : 3이라는 숫자를 3개나 남긴 그 아이디를 추출하기 위해서
    (SELECT   -- 어떤 아이디들이 3을 쓴거야?
        MEMBER_ID
    FROM REST_REVIEW

    GROUP BY MEMBER_ID
    HAVING COUNT(REVIEW_TEXT)=
            (SELECT -- 3이라는 숫자를 뽑기 위해서 
                COUNT(REVIEW_TEXT)
             FROM REST_REVIEW
             GROUP BY MEMBER_ID
             ORDER BY COUNT(REVIEW_TEXT) DESC
             LIMIT 1
            )
    )
    
ORDER BY REVIEW_DATE ASC, REVIEW_TEXT ASC