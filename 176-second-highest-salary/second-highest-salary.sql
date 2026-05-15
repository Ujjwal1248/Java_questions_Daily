# Write your MySQL query statement below
-- select MAX(salary) SecondHighestSalary from employee where salary < (select Max(salary) from employee);
-- select (select distinct salary from employee order by salary desc limit 1 offset 1) as SecondHighestSalary;
select (select salary from (select salary, DENSE_RANK() over (order by salary DESC) as rnk from employee) t where rnk = 2 limit 1) as SecondHighestSalary;