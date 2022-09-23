# Write your MySQL query statement below

# select 
# IFNULL((select salary  from Employee ORDER BY salary DESC LIMIT 1,1),NULL) SecondHighestSalary;

select MAX(salary) SecondHighestSalary from Employee where
salary!=(select MAX(salary) SecondHighestSalary from Employee);