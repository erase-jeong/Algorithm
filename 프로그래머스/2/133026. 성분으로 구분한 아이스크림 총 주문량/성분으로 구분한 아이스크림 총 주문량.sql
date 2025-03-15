SELECT I.INGREDIENT_TYPE, SUM(F.TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF AS F INNER JOIN ICECREAM_INFO AS I ON F.FLAVOR=I.FLAVOR
GROUP BY I.INGREDIENT_TYPE;