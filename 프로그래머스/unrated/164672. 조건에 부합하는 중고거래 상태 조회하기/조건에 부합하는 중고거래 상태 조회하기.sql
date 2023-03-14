SELECT board_id, writer_id, title, price, IF(status = "SALE", "판매중", IF(status = "DONE", "거래완료", "예약중")) AS status
FROM used_goods_board
WHERE DATE_FORMAT(created_date, "%Y-%m-%d") = "2022-10-05"
ORDER BY board_id DESC