SELECT MONTH(start_date) AS month, car_id, COUNT(history_id) AS records
FROM car_rental_company_rental_history
WHERE car_id IN (
    SELECT car_id 
    FROM car_rental_company_rental_history 
    WHERE YEAR(start_date) = 2022 AND MONTH(start_date) IN (8,9,10) 
    GROUP BY car_id 
    HAVING COUNT(*) >= 5)
    AND YEAR(start_date) = 2022 AND MONTH(start_date) IN (8,9,10) 
GROUP BY month, car_id
ORDER BY month ASC, car_id DESC