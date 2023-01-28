SELECT YEAR(o.sales_date) AS year, 
       MONTH(o.sales_date) AS month, 
       u.gender AS gender,
       COUNT(DISTINCT o.user_id) AS users
FROM online_sale o 
INNER JOIN user_info u ON o.user_id = u.user_id
WHERE u.gender IS NOT NULL
GROUP BY year, month, gender
ORDER BY year, month, gender