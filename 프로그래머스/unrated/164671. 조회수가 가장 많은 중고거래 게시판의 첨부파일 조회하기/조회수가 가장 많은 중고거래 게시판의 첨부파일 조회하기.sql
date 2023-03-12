SELECT CONCAT("/home/grep/src/", a.board_id, "/", file_id, file_name, file_ext) AS file_fath
FROM (SELECT * FROM used_goods_board ORDER BY views DESC LIMIT 1) a
INNER JOIN used_goods_file b
ON a.board_id = b.board_id
ORDER BY file_id DESC