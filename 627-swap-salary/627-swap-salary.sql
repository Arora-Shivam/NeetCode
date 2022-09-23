# Write your MySQL query statement below


UPDATE salary 
SET sex =
CASE WHEN sex='m' then 'f'
     WHEN sex='f' then 'm'
END;

# UPDATE salary
#   SET sex = 
#     CASE sex 
#         when 'f' then 'm' 
#         when 'm' then 'f' 