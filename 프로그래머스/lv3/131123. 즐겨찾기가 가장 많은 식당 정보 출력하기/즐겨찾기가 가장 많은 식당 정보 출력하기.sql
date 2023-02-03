SELECT a.food_type, rest_id, rest_name, a.favorites
FROM rest_info a
INNER JOIN (SELECT food_type, MAX(favorites) AS favorites FROM rest_info GROUP BY food_type) b
ON a.food_type = b.food_type AND a.favorites = b.favorites
GROUP BY food_type
ORDER BY food_type DESC