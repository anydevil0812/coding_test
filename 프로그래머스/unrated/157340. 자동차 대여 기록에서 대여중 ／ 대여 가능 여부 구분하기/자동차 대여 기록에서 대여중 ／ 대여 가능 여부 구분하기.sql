SELECT car_id, IF(MAX(end_date) >= "2022-10-16", "대여중", "대여 가능") AS availability
FROM car_rental_company_rental_history 
WHERE start_date <= "2022-10-16"
GROUP BY car_id
ORDER BY car_id DESC