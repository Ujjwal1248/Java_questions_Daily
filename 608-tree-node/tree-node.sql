# Write your MySQL query statement below
select id, 
    Case
        when p_id is NUll then 'Root'
        when id in (select distinct p_id from tree where p_id is not null) then 'Inner'
        else 'Leaf'
    END
as type from tree;