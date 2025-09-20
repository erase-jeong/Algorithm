-- 코드를 입력하세요
-- SELECT * FROM REST_REVIEW;

-- 한 아이디당 몇개의 리뷰 텍스트를 작성해야 하는지 보기
-- > 한 아이디별로 그룹핑해야한다.
/*
SELECT 
    REVIEW_ID
    ,COUNT(REVIEW_TEXT)
FROM REST_REVIEW
GROUP BY MEMBER_ID
ORDER BY COUNT(REVIEW_TEXT) DESC
*/
-- > 가장 많이 쓴 아이디가 3개(COUNT)이고 총 3개가 조회된다.

-- 서브퀴리로 두기 => WHY? => 무엇을 필터링 하려고 하는 의도
-- 가장 많은 댓글의 개수를 필터링하려고 한다.


/*
(SELECT
    COUNT(REVIEW_TEXT)
 FROM REST_REVIEW
 GROUP BY MEMBER_ID
 ORDER BY COUNT(REVIEW_TEXT) DESC
 LIMIT 1
)
*/
-- 한 아이디당 쓴 텍스트를 내림차순으로 했고,
-- 가장 많이 쓴 최댓값을 구하기 위해서 LIMIT 1을 했음



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