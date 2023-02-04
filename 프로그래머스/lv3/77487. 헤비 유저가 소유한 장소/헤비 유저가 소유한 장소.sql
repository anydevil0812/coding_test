SELECT *
FROM places
WHERE host_id in (SELECT host_id FROM places GROUP BY host_id HAVING COUNT(host_id) > 1)