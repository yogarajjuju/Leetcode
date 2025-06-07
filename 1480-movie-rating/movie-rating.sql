-- First part: Most active user
(
SELECT u.name AS results
FROM MovieRating mr
JOIN Users u ON mr.user_id = u.user_id
GROUP BY u.user_id
ORDER BY COUNT(*) DESC, u.name
LIMIT 1
)
UNION ALL
-- Second part: Highest rated movie in Feb 2020
(
SELECT m.title AS results
FROM MovieRating mr
JOIN Movies m ON mr.movie_id = m.movie_id
WHERE mr.created_at BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY m.movie_id
ORDER BY AVG(mr.rating) DESC, m.title
LIMIT 1
);
