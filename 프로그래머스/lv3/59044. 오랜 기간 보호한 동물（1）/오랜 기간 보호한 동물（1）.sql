SELECT i.name, i.datetime
FROM animal_ins i
LEFT OUTER JOIN animal_outs o ON i.animal_id = o.animal_id
WHERE o.datetime IS NULL
ORDER BY i.datetime ASC
LIMIT 3