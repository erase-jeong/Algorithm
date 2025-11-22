-- 코드를 입력하세요
-- SELECT * FROM ANIMAL_INS
-- SELECT * FROM ANIMAL_OUTS

-- * 방법 1

/*
SELECT

    O.ANIMAL_ID
    ,O.ANIMAL_TYPE
    ,O.NAME

    I.ANIMAL_ID
    ,I.ANIMAL_TYPE
    ,I.NAME
FROM ANIMAL_INS AS I
JOIN ANIMAL_OUTS AS O
ON I.ANIMAL_ID=O.ANIMAL_ID

WHERE I.SEX_UPON_INTAKE LIKE '%Intact%'  -- 중성화 되지 않은 동물들
    AND 
    (O.SEX_UPON_OUTCOME LIKE '%Spayed%'
     OR O.SEX_UPON_OUTCOME LIKE '%Neutered%')
     
 ORDER BY I.ANIMAL_ID ASC    
-- 들어올 때 중성화가 오지 않은 걸 AND조건을 묶는 것
*/

SELECT 
    I.ANIMAL_ID
    ,I.ANIMAL_TYPE
    ,I.NAME
FROM ANIMAL_INS AS I
JOIN ANIMAL_OUTS AS O
ON I.ANIMAL_ID=O.ANIMAL_ID
WHERE 
    I.SEX_UPON_INTAKE LIKE '%Intact%'
    AND
    O.SEX_UPON_OUTCOME NOT LIKE '%Intact%'

ORDER BY I.ANIMAL_ID ASC

-- 이 풀이는 가정하에
-- 모든 컬럼들이 Spayed, Intact, Neutral 밖에 없다는 가정 하에