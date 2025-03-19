SELECT ri.REST_ID, ri.REST_NAME, ri.FOOD_TYPE, ri.FAVORITES, ri.ADDRESS, ROUND(AVG(REVIEW_SCORE),2) AS SCORE
FROM REST_REVIEW rr 
	JOIN REST_INFO ri ON rr.REST_ID=ri.REST_ID
WHERE ADDRESS LIKE '서울%'
GROUP BY REST_ID
ORDER BY SCORE DESC, ri.FAVORITES DESC;