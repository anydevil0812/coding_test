SELECT b.book_id, a.author_name, DATE_FORMAT(b.published_date, "%Y-%m-%d") AS published_date FROM BOOK b INNER JOIN AUTHOR a WHERE a.author_id = b.author_id AND b.category = "경제" ORDER BY published_date ASC