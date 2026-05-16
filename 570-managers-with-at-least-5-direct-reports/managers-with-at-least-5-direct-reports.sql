# Write your MySQL query statement belos
select e1.name from employee e1 left join employee e2 on e1.id = e2.managerid group by e1.id, e1.name having count(e2.id) >= 5;