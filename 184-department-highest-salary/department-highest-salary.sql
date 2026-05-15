# Write your MySQL query statement below
-- select name as Employee, salary from employee order by departmentid having max(salary);
select d.name as Department, 
       e.name as Employee,
       e.salary 
from employee e join department d
on e.departmentid = d.id
where (e.departmentid, e.salary) in (
    select departmentid, MAX(salary)
    from employee group by departmentid
);