SELECT COUNT(*) AS FISH_COUNT
FROM FISH_INFO
WHERE 1=1
	AND SUBSTR(TIME,1,4)='2021';

