# Write your MySQL query statement below
select e.name, d.unique_id as unique_id
from Employees e 
left join EmployeeUNI d on e.id = d.id