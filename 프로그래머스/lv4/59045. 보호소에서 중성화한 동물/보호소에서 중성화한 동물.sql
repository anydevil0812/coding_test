SELECT i.animal_id, i.animal_type, i.name
FROM (SELECT * FROM animal_ins WHERE sex_upon_intake LIKE "%Intact%") i
INNER JOIN (SELECT * FROM animal_outs WHERE sex_upon_outcome LIKE "%Spayed%" OR sex_upon_outcome LIKE "%Neutered%") o
ON i.animal_id = o.animal_id