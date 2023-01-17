SELECT YEAR(o.sales_date) AS YEAR, MONTH(o.sales_date) AS MONTH, 
COUNT(DISTINCT u.user_id) AS puchased_users,
ROUND(COUNT(DISTINCT u.user_id) / (SELECT COUNT(*) FROM user_info WHERE YEAR(joined) = 2021), 1) AS puchased_ratio 
FROM user_info u 
INNER JOIN online_sale o ON u.user_id = o.user_id 
WHERE YEAR(u.joined) = 2021 
GROUP BY month
ORDER BY month ASC
