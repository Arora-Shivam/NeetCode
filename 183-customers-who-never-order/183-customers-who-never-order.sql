# Write your MySQL query statement below

select c.name as Customers from Customers c
LEFT JOIN
Orders o
ON c.id=o.customerId
WHERE  ISNULL(o.id)=1;