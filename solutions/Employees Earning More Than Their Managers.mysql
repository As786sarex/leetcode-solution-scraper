# Write your MySQL query statement below
select e.Name as Employee from Employee e where e.ManagerId is not null and e
    .Salary > any(select ee.Salary from Employee ee where ee.Id=e.ManagerId);
