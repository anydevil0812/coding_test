SELECT p.product_id, product_name, price * amount AS total_sales
FROM food_product p
INNER JOIN (SELECT product_id, produce_date, SUM(amount) AS amount FROM food_order WHERE DATE_FORMAT(produce_date, "%Y-%m") = "2022-05" GROUP BY product_id) o
ON p.product_id = o.product_id
ORDER BY total_sales DESC, p.product_id ASC