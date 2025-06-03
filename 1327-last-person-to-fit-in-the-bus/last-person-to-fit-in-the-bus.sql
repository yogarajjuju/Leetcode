# Write your MySQL query statement below
WITH OrderedQueue AS (
    SELECT *
    FROM Queue
    ORDER BY turn
),
CumulativeWeight AS (
    SELECT *,
           SUM(weight) OVER (ORDER BY turn) AS total_weight
    FROM OrderedQueue
)
SELECT person_name
FROM CumulativeWeight
WHERE total_weight <= 1000
ORDER BY total_weight DESC
LIMIT 1;
