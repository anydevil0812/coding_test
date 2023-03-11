SELECT user_id, nickname, total_sales
FROM (SELECT *, SUM(price) AS total_sales FROM (SELECT * FROM used_goods_board WHERE status = "DONE") a GROUP BY writer_id HAVING total_sales >= 700000) b
INNER JOIN used_goods_user c
ON b.writer_id = c.user_id
ORDER BY total_sales ASC