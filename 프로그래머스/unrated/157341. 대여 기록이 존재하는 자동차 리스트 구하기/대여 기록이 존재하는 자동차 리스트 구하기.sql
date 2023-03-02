SELECT DISTINCT a.car_id
FROM car_rental_company_car a
INNER JOIN car_rental_company_rental_history b
ON a.car_id = b.car_id
WHERE a.car_type = "세단" AND MONTH(b.start_date) = 10
ORDER BY a.car_id DESC