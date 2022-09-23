# Write your MySQL query statement below

# DATE_SUB(date, INTERVAL value interval)


select w1.id from Weather w1, Weather w2
where w2.recordDate=DATE_SUB(w1.recordDate,INTERVAL 1 DAY)
AND w1.temperature>w2.temperature;


# select id, DATE_SUB(recordDate,INTERVAL 1 DAY) from weather;

# {"headers": ["id", "recordDate", "temperature", "id", "recordDate", "temperature"], "values": [[1, "2015-01-01", 10, 2, "2015-01-02", 25], [2, "2015-01-02", 25, 3, "2015-01-03", 20], [3, "2015-01-03", 20, 4, "2015-01-04", 30]]}