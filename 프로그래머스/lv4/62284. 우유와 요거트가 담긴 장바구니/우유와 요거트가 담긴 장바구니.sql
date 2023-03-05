SELECT cart_id
FROM (SELECT cart_id, name FROM cart_products WHERE name IN ("Milk", "Yogurt") GROUP BY cart_id, name) a
GROUP BY cart_id
HAVING count(*) >= 2
ORDER BY cart_id ASC