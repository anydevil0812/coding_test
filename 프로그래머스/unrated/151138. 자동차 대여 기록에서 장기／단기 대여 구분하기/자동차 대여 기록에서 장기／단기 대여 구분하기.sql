SELECT history_id, car_id, 
DATE_FORMAT(start_date, "%Y-%m-%d") AS start_date, 
DATE_FORMAT(end_date, "%Y-%m-%d") AS end_date, 
IF(TIMESTAMPDIFF(DAY, start_date, end_date) + 1 >= 30, "장기 대여", "단기 대여") AS rent_type 
FROM car_rental_company_rental_history 
WHERE YEAR(start_date) = 2022 AND MONTH(start_date) = 9 
ORDER BY history_id DESC