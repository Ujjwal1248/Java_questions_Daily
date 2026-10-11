# Write your MySQL query statement below
-- select MAX(salary) as SecondHighestSalary from employee where salary < (select MAX(salary) from employee);
-- select (select DISTINCT salary from employee ORDER BY salary Desc LIMIT 1 OFFSET 1) as SecondHighestSalary;
select (select salary from (select salary, Dense_Rank() over(Order By salary DESC) as rnk from employee) x where rnk = 2 limit 1) as secondHighestSalary;