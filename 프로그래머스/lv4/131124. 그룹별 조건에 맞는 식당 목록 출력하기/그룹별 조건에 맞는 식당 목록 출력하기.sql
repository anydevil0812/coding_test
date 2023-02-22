SELECT member_name, review_text, DATE_FORMAT(review_date, "%Y-%m-%d") AS review_date
FROM member_profile m
INNER JOIN rest_review r ON m.member_id = r.member_id
WHERE m.member_id = (SELECT member_id FROM rest_review GROUP BY member_id ORDER BY COUNT(member_id) DESC LIMIT 1)
ORDER BY review_date ASC, review_text ASC