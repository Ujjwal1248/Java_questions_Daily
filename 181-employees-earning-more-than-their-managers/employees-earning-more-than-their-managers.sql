# Write your MySQL query statement below
-- select e1.name as Employee from employee as e1 where e1.salary > (select e2.salary from employee as e2 where e2.id = e1.managerId);
select e1.name as Employee from employee e1 JOIN employee e2 on e1.managerId = e2.id where e1.salary > e2.salary;