WITH RECURSIVE time AS (SELECT 0 AS hour UNION ALL SELECT hour+1 FROM time WHERE hour<23)
SELECT time.hour, COUNT(a.datetime) AS count
FROM animal_outs a
RIGHT JOIN time ON time.hour = HOUR(a.datetime) 
GROUP BY hour
ORDER BY hour ASC