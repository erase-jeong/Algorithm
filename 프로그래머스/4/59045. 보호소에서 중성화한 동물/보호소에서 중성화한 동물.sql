-- 코드를 입력하세요
-- SELECT * FROM ANIMAL_INS
-- SELECT * FROM ANIMAL_OUTS

SELECT
    O.ANIMAL_ID
    ,O.ANIMAL_TYPE
    ,O.NAME
FROM ANIMAL_INS AS I
JOIN ANIMAL_OUTS AS O
ON I.ANIMAL_ID=O.ANIMAL_ID

WHERE I.SEX_UPON_INTAKE LIKE '%Intact%'  -- 중성화 되지 않은 동물들
    AND 
    
    (O.SEX_UPON_OUTCOME LIKE '%Spayed%'
     OR O.SEX_UPON_OUTCOME LIKE '%Neutered%')
     
     
-- 들어올 때 중성화가 오지 않은 걸 AND조건을 묶는 것
