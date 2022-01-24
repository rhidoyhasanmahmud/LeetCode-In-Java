# Write your MySQL query statement below

select e.name as Employee from employee as e where e.salary>(select m.salary from employee as m where m.id = e.managerId) ;
