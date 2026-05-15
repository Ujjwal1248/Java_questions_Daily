# Write your MySQL query statement below
select Department, Employee, Salary
from (
    select d.name as Department, 
        e.name as Employee,
        e.salary as salary,
    DENSE_RANK() over(
        partition by e.departmentid
        order by e.salary DESC
    ) as rnk
    from employee as e
    join department as d
    on e.departmentid = d.id
)t where rnk<=3
