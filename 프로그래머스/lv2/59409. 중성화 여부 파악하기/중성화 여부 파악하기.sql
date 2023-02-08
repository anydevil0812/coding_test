SELECT animal_id, name, 
IF(SUBSTRING_INDEX(sex_upon_intake, " ", 1) = "Neutered" 
OR SUBSTRING_INDEX(sex_upon_intake, " ", 1) = "Spayed", "O", "X") AS "중성화"
FROM animal_ins
ORDER BY animal_id ASC