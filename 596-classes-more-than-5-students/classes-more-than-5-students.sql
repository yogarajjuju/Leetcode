# Write your MySQL query statement belowSELECT class
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;

