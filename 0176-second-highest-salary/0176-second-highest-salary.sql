/*
select * 
from (
select id,salary,RANK() OVER (ORDER BY salary DESC) RANKING
from Employee
order by salary desc
) as EE
where RANKING=2
*/

select 
(SELECT DISTINCT salary
FROM Employee
ORDER BY salary DESC
LIMIT 1 offset 1)
as SecondHighestSalary;