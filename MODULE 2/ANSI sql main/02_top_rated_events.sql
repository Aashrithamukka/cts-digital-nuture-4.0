-- 2. Top Rated Events
SELECT e.title, AVG(f.rating) AS average_rating, COUNT(f.feedback_id) AS feedback_count
FROM Events e
JOIN Feedback f ON e.event_id = f.event_id
GROUP BY e.event_id
HAVING feedback_count >= 10
ORDER BY average_rating DESC;