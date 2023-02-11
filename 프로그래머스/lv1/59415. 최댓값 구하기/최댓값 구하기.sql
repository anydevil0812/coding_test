SELECT datetime AS "시간"
FROM animal_ins
WHERE datetime = (SELECT MAX(datetime) AS a FROM animal_ins)